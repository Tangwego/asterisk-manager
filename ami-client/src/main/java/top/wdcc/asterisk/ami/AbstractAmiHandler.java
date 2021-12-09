package top.wdcc.asterisk.ami;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.wdcc.asterisk.ami.actions.AmiAction;

import java.util.Queue;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 抽象类分发Channel收到数据
 *
 * @author Wavin
 */
public abstract class AbstractAmiHandler extends SimpleChannelInboundHandler<AmiMessage> {
    private static final Logger logger = LoggerFactory.getLogger(AbstractAmiHandler.class);

    private Queue<CompletableFuture<AmiMessage>> commandQueue = new LinkedBlockingQueue<>();
    private static final Lock syncLock = new ReentrantLock();
    private static final ThreadPoolExecutor executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
            60L, TimeUnit.SECONDS,
            new SynchronousQueue<Runnable>(), new ThreadFactory() {
        private final AtomicInteger integer = new AtomicInteger();
        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "ami-" + integer.incrementAndGet());
        }
    });

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, AmiMessage message) throws Exception {
        executor.submit(()-> {
            logger.info("received ami message: {}", message);
            switch (message.getType()) {
                case AUTH_REQUEST:
                    handleLogin(ctx,message);
                    break;
                case RESPONSE:
                    commandQueue.poll().complete(message);
                    break;
                case EVENT:
                    handleEvent(ctx, message);
                    break;
                default:
                    throw new IllegalStateException(String.format("Cannot handle this type: %s", message.getType()));
            }
        });
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
