package top.wdcc.asterisk.ami;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.wdcc.asterisk.ami.actions.AmiAction;

import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * abstract netty channel handler.
 *
 * @author wavin
 */
public abstract class AbstractAmiHandler extends SimpleChannelInboundHandler<AmiMessage> {
    private static final Logger logger = LoggerFactory.getLogger(AbstractAmiHandler.class);

    private Queue<CompletableFuture<AmiMessage>> commandQueue = new LinkedBlockingQueue<>();
    private static final Lock syncLock = new ReentrantLock();

    public static final EventLoopGroup executor = new NioEventLoopGroup(new ThreadFactory() {
        private final AtomicInteger integer = new AtomicInteger();
        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "ami-" + integer.incrementAndGet());
        }
    });

    public static final EventLoopGroup eventPool = new NioEventLoopGroup(1, r -> {
        return new Thread(r, "ami-event");
    });

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, AmiMessage message) throws Exception {
        logger.info("received ami message: {}", message);
        switch (message.getType()) {
            case AUTH_REQUEST:
                executor.submit(()-> {
                    handleLogin(ctx, message);
                });
                break;
            case RESPONSE:
                executor.submit(()-> {
                    commandQueue.poll().complete(message);
                });
                break;
            case EVENT:
                eventPool.submit(()-> {
                    handleEvent(ctx, message);
                });
                break;
            default:
                throw new IllegalStateException(String.format("Cannot handle this type: %s", message.getType()));
        }
    }

    protected abstract void handleEvent(ChannelHandlerContext ctx, AmiMessage message);

    protected abstract void handleLogin(ChannelHandlerContext ctx, AmiMessage message);

    public AmiMessage sendCommand(Channel channel, AmiAction action){
        CompletableFuture<AmiMessage> future = new CompletableFuture();
        syncLock.lock();
        try {
            commandQueue.add(future);
            channel.writeAndFlush(action);
        } finally {
            syncLock.unlock();
        }
        try {
            return future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }

}
