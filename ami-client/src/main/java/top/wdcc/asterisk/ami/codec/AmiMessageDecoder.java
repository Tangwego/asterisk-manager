package top.wdcc.asterisk.ami.codec;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import org.apache.commons.lang3.StringUtils;
import top.wdcc.asterisk.ami.AmiMessage;
import top.wdcc.asterisk.ami.AmiMessageImpl;

import java.util.List;

/**
 * Ami Message Decoder.
 * decode before received ami messages.
 * @author wavin
 */
public class AmiMessageDecoder extends ReplayingDecoder<AmiMessageDecoder.State> {

    private static final String SPLITOR = ": ";

    enum State {
        START
    }

    private AmiMessageImpl message;

    public AmiMessageDecoder() {
        super(State.START);
    }

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        State state = state();
        switch (state) {
            case START:
                String header = readLine(byteBuf);

                if (this.message == null) {
                    message = new AmiMessageImpl();
                }

                if (StringUtils.equalsIgnoreCase(header, AmiMessage.AMI_AUTH_REQUEST)) {
                    // 认证请求
                    message.setType(AmiMessage.Type.AUTH_REQUEST);
                } else if(StringUtils.startsWithIgnoreCase(header, AmiMessage.AMI_EVENT)){
                    // 事件
                    message.setType(AmiMessage.Type.EVENT);
                    if (header.indexOf(SPLITOR) > -1) {
                        String field = header.substring(0, header.indexOf(SPLITOR));
                        String value = header.substring(header.indexOf(SPLITOR) + 2);
                        message.addParams(field, value);
                    }
                    boolean readDoubleCRLF = false;
                    while (!readDoubleCRLF) {
                        String line = readLine(byteBuf);
                        if (StringUtils.isNotEmpty(line)) {
                            if (line.indexOf(SPLITOR) > -1) {
                                String field = line.substring(0, line.indexOf(SPLITOR));
                                String value = line.substring(line.indexOf(SPLITOR) + 2);
                                message.addParams(field, value);
                            }
                        } else {
                            readDoubleCRLF = true;
                        }
                    }
                } else {
                    // 响应消息
                    message.setType(AmiMessage.Type.RESPONSE);
                    if (header.indexOf(SPLITOR) > -1) {
                        String field = header.substring(0, header.indexOf(SPLITOR));
                        String value = header.substring(header.indexOf(SPLITOR) + 2);
                        message.addParams(field, value);
                    } else {
                        message.setSuccess(true);
                        message.addBody(header);
                    }
                    boolean readDoubleCRLF = false;
                    while (!readDoubleCRLF) {
                        String line = readLine(byteBuf);
                        if (StringUtils.isNotEmpty(line)) {
                            if (line.indexOf(SPLITOR) > -1) {
                                String field = line.substring(0, line.indexOf(SPLITOR));
                                String value = line.substring(line.indexOf(SPLITOR) + 2);
                                message.addParams(field, value);
                            } else {
                                message.addBody(line);
                            }
                        } else {
                            readDoubleCRLF = true;
                        }
                    }
                }

                if (this.message != null) {
                    list.add(message);
                }
                this.message = null;

                break;
            default:
                throw new IllegalStateException(String.format("Cannot find this state: %s", state));
        }
    }


    private String readLine(ByteBuf buf) {
        StringBuilder sb = new StringBuilder();
        boolean hasCR = false;
        while (buf.isReadable()) {
            char a = (char)buf.readByte();
            if (a == StringUtils.LF.charAt(0)) {
                if (hasCR) {
                    return sb.toString();
                }
            } else if (a == StringUtils.CR.charAt(0)) {
                hasCR = true;
            } else {
                sb.append(a);
            }
        }
        return null;
    }

    private void updateType(AmiMessageImpl message, String field) {
        if (StringUtils.equalsIgnoreCase(field, AmiMessage.AMI_RESPONSE)) {
            message.setType(AmiMessage.Type.RESPONSE);
        } else if (StringUtils.equalsIgnoreCase(field, AmiMessage.AMI_EVENT)) {
            message.setType(AmiMessage.Type.EVENT);
        } else if (StringUtils.equalsIgnoreCase(field, AmiMessage.AMI_AUTH_REQUEST)) {
            message.setType(AmiMessage.Type.AUTH_REQUEST);
        } else {
            if (message.getType() == null) {
                message.setType(AmiMessage.Type.UNKNOW);
            }
        }
    }
}
