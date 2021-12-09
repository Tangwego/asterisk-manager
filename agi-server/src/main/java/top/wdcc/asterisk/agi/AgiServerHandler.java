package top.wdcc.asterisk.agi;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelId;
import io.netty.channel.SimpleChannelInboundHandler;
import org.reflections.Reflections;
import top.wdcc.asterisk.agi.cmds.AgiCommand;

import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AgiServerHandler extends SimpleChannelInboundHandler<AgiMessage> {

    private static final String SPLITOR = "\n";

    private static final Map<ChannelId, AgiChannel> channels = new ConcurrentHashMap<>();
    private static final Map<String, BaseAgiScript> scripts = new ConcurrentHashMap<>();

    private Queue<CompletableFuture<AgiMessage>> commandQueue = new LinkedBlockingQueue<>();
    private static final Lock syncLock = new ReentrantLock();
    private static final ThreadPoolExecutor executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
            60L, TimeUnit.SECONDS,
            new SynchronousQueue<Runnable>(), new ThreadFactory() {
        private final AtomicInteger integer = new AtomicInteger();
        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "agi-" + integer.incrementAndGet());
        }
    });

    public AgiServerHandler(){
        Reflections reflections = new Reflections("");
        Set<Class<? extends BaseAgiScript>> agiScripts = reflections.getSubTypesOf(BaseAgiScript.class);
        agiScripts.forEach((script) -> {
            try {
                BaseAgiScript baseAgiScript = script.newInstance();
                scripts.put(script.getSimpleName(), baseAgiScript);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, AgiMessage msg) throws Exception {
        executor.submit(()-> {
            switch (msg.getType()) {
                case CONNECT:
                    Channel channel = channelHandlerContext.channel();
                    AgiChannel agiChannel = new AgiChannel(msg, channel, this);
                    channels.put(channel.id(), agiChannel);
                    BaseAgiScript script = scripts.get(agiChannel.getAgiScript());
                    if (script != null) {
                        script.service(agiChannel);
                    }
                    break;
                case RESPONSE:
                    AgiChannel ch = channels.get(channelHandlerContext.channel().id());
                    if (ch != null) {
                        commandQueue.poll().complete(msg);
                    } else {
                        throw new IllegalStateException("No such channel!");
                    }
                    break;
                case HANGUP:
                    close(channelHandlerContext.channel());
                    break;
                default:
                    throw new IllegalStateException("Unsupported type: " + msg.getType());
            }
        });
    }

    protected void close(Channel channel) {
        channels.remove(channel.id());
        channel.closeFuture();
    }

    protected AgiMessage sendCommand(Channel channel, AgiCommand cmd){
        CompletableFuture<AgiMessage> future = new CompletableFuture<>();
        syncLock.lock();
        try {
            commandQueue.add(future);
            channel.writeAndFlush(cmd.getCommandString() + SPLITOR);
        }finally {
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
