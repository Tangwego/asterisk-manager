package com.m7.ast.ami.codec;

import com.m7.ast.ami.transport.AmiAction;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

import java.util.Map;

/**
 * Action编码器
 *
 * @author TANG
 */
public class AmiActionEncoder extends MessageToByteEncoder<AmiAction> {
    public static final String COMMAND_DELIMITER = "\r\n";
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, AmiAction action, ByteBuf byteBuf) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("Action: ");
        sb.append(action.getName());
        sb.append("\n");
        Map<String, String> params = action.getParams();
        for (Map.Entry<String,String> entry : params.entrySet()) {
            sb.append(String.format("%s: %s\n", entry.getKey(), entry.getValue()));
        }
        sb.append(COMMAND_DELIMITER);
        byteBuf.writeBytes(sb.toString().getBytes());
    }
}
