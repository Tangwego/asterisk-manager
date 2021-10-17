package top.wdcc.ast.agi.server;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;

import java.util.List;

public class AgiMessageDecoder extends ReplayingDecoder<AgiMessageDecoder.State> {
    enum State {
        TYPE,
        BODY
    }

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {

    }

}
