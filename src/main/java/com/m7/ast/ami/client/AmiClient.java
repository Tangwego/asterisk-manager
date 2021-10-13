package com.m7.ast.ami.client;

import com.m7.ast.ami.actions.LogoffAction;
import com.m7.ast.ami.codec.AmiActionEncoder;
import com.m7.ast.ami.codec.AmiMessageDecoder;
import com.m7.ast.ami.handler.AmiClientHandler;
import com.m7.ast.ami.transport.AmiAction;
import com.m7.ast.ami.transport.AmiEvent;
import com.m7.ast.ami.transport.AmiMessage;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Ami客户端
 *
 * @author TANG
 */
public class AmiClient implements AmiEventListener{
    private static final Logger logger = LoggerFactory.getLogger(AmiClient.class);
    private static EventLoopGroup group = new NioEventLoopGroup();
    private Channel channel;
    private boolean isLogin;
    private AtomicBoolean authenticated = new AtomicBoolean(false);
    private AmiEventListener listener;

    public AmiClient(){

    }

    public AmiClient(AmiConfig config){

    }

    public void setEventListener(AmiEventListener listener) {
        this.listener = listener;
    }

    public void connect(String host, int port, int timeout, AmiConfig config) throws InterruptedException {
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
        ChannelFuture future = bootstrap.connect(host, port).sync();
        if (!future.awaitUninterruptibly(timeout, TimeUnit.SECONDS)) {
            throw new AmiConnectException("Connect to %s:%d failed!", host, port);
        } else {
            // TODO 检查认证是否通过
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
