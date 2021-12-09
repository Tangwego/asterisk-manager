package top.wdcc.asterisk.agi;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class AgiMessageDecoder extends ReplayingDecoder<AgiMessageDecoder.State> {
    private static final String SPLITOR = ":";
    private static final String HANGUP = "HANGUP";
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
                        if (StringUtils.containsIgnoreCase(line, HANGUP)) {
                            agiMessage.setType(AgiType.HANGUP);
                            readDoubleLF = true;
                        } else if (StringUtils.contains(line, SPLITOR)) {
                            String[] split = line.split(SPLITOR);
                            agiMessage.addParam(split[0], split[1].substring(1));
                            agiMessage.setType(AgiType.CONNECT);
                        }else {
                            int i = line.indexOf(" ");
                            if (i != -1) {
                                agiMessage.setType(AgiType.RESPONSE);
                                agiMessage.setCode(Integer.parseInt(line.substring(0, i)));
                                agiMessage.setMessage(line.substring(i + 1));
                            }
                            readDoubleLF = true;
                        }
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
