package top.wdcc.asterisk.ami;

import top.wdcc.asterisk.ami.actions.LogoffAction;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.wdcc.asterisk.ami.codec.AmiActionEncoder;
import top.wdcc.asterisk.ami.codec.AmiMessageDecoder;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Ami Client
 *
 * @author Wavin
 */
public class AmiClient implements AmiEventListener {
    private static final Logger logger = LoggerFactory.getLogger(AmiClient.class);
    private static EventLoopGroup group = new NioEventLoopGroup();
    private Channel channel;
    private boolean isLogin;
    private AtomicBoolean authenticated = new AtomicBoolean(false);
    private AmiEventListener listener;
    private AmiConfig config;
    private static final ThreadPoolExecutor pingThread = new ThreadPoolExecutor(1, 1,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>(), r -> new Thread(r, "Ami-Ping-Thread"));

    public AmiClient(String host, int port) {
        this.config = new AmiConfig();
        this.config.setHost(host);
        this.config.setPort(port);
        this.config.setTimeout(30);
    }

    public AmiClient(AmiConfig config){
        if (config == null) {
            throw new IllegalArgumentException("config cannot be null");
        }
        if (config.getHost() == null || config.getHost().isEmpty()) {
            throw new IllegalArgumentException("host cannot be empty");
        }
        this.config = config;
        if (config.getPort() <= 0 || config.getPort() >= 65535) {
            this.config.setPort(5038);
        }

    }

    public void setEventListener(AmiEventListener listener) {
        this.listener = listener;
    }

    public void login() throws InterruptedException {
        login(this.config);
    }

    public void login(String username, String secret) throws InterruptedException {
        this.config.setUsername(username);
        this.config.setSecret(secret);
        login(config);
    }

    private void login(AmiConfig config) throws InterruptedException {
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channelFactory(NioSocketChannel::new)
                .option(ChannelOption.SO_KEEPALIVE, true)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        socketChannel.pipeline()
                                .addLast(new AmiActionEncoder())
                                .addLast(new AmiMessageDecoder())
                                .addLast(new AmiClientHandler(config, AmiClient.this));
                    }
                });
        ChannelFuture future = bootstrap.connect(config.getHost(), config.getPort()).sync();
        if (!future.awaitUninterruptibly(config.getTimeout(), TimeUnit.SECONDS)) {
            throw new AmiConnectException("Connect to %s:%d failed!", config.getHost(), config.getPort());
        } else {
            this.channel = future.channel();
            if (!future.isSuccess()) {
                this.channel = null;
                close();
            }

            while (!authenticated.get()) {
                Thread.sleep(250);
            }

            if (!isLogin) {
                throw new IllegalStateException("Authentication failed!");
            }
        }
    }

    public AmiMessage sendAction(AmiAction action) {
        checkState();
        AmiClientHandler handler = (AmiClientHandler)this.channel.pipeline().last();
        return handler.sendCommand(this.channel, action);
    }

    private void checkState(){
        if (!isActive()) {
            throw new IllegalStateException("Connection state error!");
        }
    }

    public boolean isConnected(){
        return (this.channel != null && this.channel.isActive());
    }

    public boolean isActive(){
        return isConnected() && isLogin;
    }


    @Override
    public void onLogin(boolean success) {
        logger.info("authenticated result: [{}]", success);
        if (success) {
            pingThread.submit(new PingThread(this, 3000));
        }
        authenticated.set(true);
        this.isLogin = success;
        if (this.listener != null) {
            this.listener.onLogin(success);
        }
    }

    @Override
    public void onEvent(AmiEvent event) {
        logger.info("received event: [{}]", event);
        if (this.listener != null) {
            this.listener.onEvent(event);
        }
    }

    public void close(){
        if(this.isActive()){
            sendAction(new LogoffAction());
        }
        group.shutdownGracefully();
    }

}
