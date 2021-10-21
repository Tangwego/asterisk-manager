package top.wdcc.ast.agi.server;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class AgiMessageDecoder extends ReplayingDecoder<AgiMessageDecoder.State> {
    enum State {
        HEADER
    }

    private AgiMessage agiMessage;

    public AgiMessageDecoder(){
        state(State.HEADER);
    }

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        State state = state();
        switch (state) {
            case HEADER:
                if (agiMessage == null) {
                    agiMessage = new AgiMessage();
                }

                boolean readDoubleLF = false;
                while (!readDoubleLF) {
                    String line = readLine(byteBuf);
                    if (StringUtils.isNotEmpty(line)) {
                        String[] split = line.split("=");
                        agiMessage.addParam(split[0], split[1]);
                    } else {
                        readDoubleLF = true;
                    }
                }

                list.add(agiMessage);
                agiMessage = null;
                break;
            default:
                break;
        }
    }

    private String readLine(ByteBuf buf) {
        StringBuilder sb = new StringBuilder();
        while (buf.isReadable()) {
            byte ch = buf.readByte();
            if (ch == StringUtils.LF.charAt(0)) {
                break;
            }
            sb.append((char)ch);
        }
        return sb.toString();
    }

}
