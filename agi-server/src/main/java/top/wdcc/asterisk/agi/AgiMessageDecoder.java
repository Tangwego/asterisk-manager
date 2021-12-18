package top.wdcc.asterisk.agi;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * agi message decoder
 * @author wavin
 */
public class AgiMessageDecoder extends ReplayingDecoder<AgiMessageDecoder.State> {
    private static final String SPLITOR = ":";
    private static final String HANGUP = "HANGUP";
    private static final int NUMBERIC_LENGTH = 3;
    private static final String SHOW_USAGE_END = "520 End of proper usage.";
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
//                    System.out.println(String.format("[%s]", line));
                    if (StringUtils.isNotEmpty(line)) {
                        if (StringUtils.containsIgnoreCase(line, HANGUP)) {
                            // hangup
                            agiMessage.setType(AgiType.HANGUP);
                            readDoubleLF = true;
                        } else if (StringUtils.isNumeric(StringUtils.substring(line, 0, NUMBERIC_LENGTH))) {
                            // response
                            agiMessage.setType(AgiType.RESPONSE);
                            agiMessage.setCode(Integer.parseInt(StringUtils.substring(line, 0, NUMBERIC_LENGTH)));
                            agiMessage.setMessage(StringUtils.substring(line, NUMBERIC_LENGTH + 1));
                            if (agiMessage.getMessage().startsWith("result")) {
                                readDoubleLF = true;
                            }
                        } else {
                            // agi connect message
                            if (!line.startsWith("agi_") && !line.startsWith("ogi_")) {
                                agiMessage.appendMessage(line);
                                if (StringUtils.endsWithIgnoreCase(line, SHOW_USAGE_END)) {
                                    readDoubleLF = true;
                                }
                            } else {
                                String[] split = line.split(SPLITOR);
                                agiMessage.addParam(split[0], split[1].substring(1));
                                agiMessage.setType(AgiType.CONNECT);
                            }
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
