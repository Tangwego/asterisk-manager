package top.wdcc.asterisk.agi;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.string.StringEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AgiServer {
    private static final Logger logger = LoggerFactory.getLogger(AgiServer.class);
    private static final EventLoopGroup boss = new NioEventLoopGroup();
    private static final EventLoopGroup work = new NioEventLoopGroup();
    private boolean isStarted = false;
    private int port;
    private AgiServerHandler handler;
    public AgiServer(int port) {
        this.port = port;
        handler = new AgiServerHandler();
    }

    public void start(){
        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.group(boss, work)
                .option(ChannelOption.SO_BACKLOG, 128)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        socketChannel.pipeline()
                                .addLast(new StringEncoder())
                                .addLast(new AgiMessageDecoder())
                                .addLast(handler);
                    }
                });
        try {
            ChannelFuture future = bootstrap.bind(port).sync();
            if (future.isSuccess()) {
                logger.info("agi server start at:[{}]", port);
                this.isStarted = true;
            } else {
                logger.error("agi server start failed!");
                future.cause().printStackTrace();
                boss.shutdownGracefully();
                work.shutdownGracefully();
            }
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.isStarted = false;
    }

    public boolean isStarted() {
        return this.isStarted;
    }

    public void stop(){
        boss.shutdownGracefully();
        work.shutdownGracefully();
    }

}
