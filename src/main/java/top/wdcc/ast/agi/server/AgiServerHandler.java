package top.wdcc.ast.agi.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class AgiServerHandler extends SimpleChannelInboundHandler<AgiMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, AgiMessage msg) throws Exception {
        System.out.println(msg.toString());
    }
}
