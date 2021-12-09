package top.wdcc.asterisk.agi;

import io.netty.channel.Channel;
import top.wdcc.asterisk.agi.cmds.HangupCommand;

public class AgiChannel {
    private AgiMessage message;

    private Channel channel;

    private AgiServerHandler handler;

    public AgiChannel(AgiMessage message, Channel channel, AgiServerHandler handler) {
        this.message = message;
        this.channel = channel;
        this.handler = handler;
    }

    public String getAgiScript(){
        return message.getParam(AgiMessage.AGI_NETWORK_SCRIPT);
    }

    public void close(){
        handler.sendCommand(channel, new HangupCommand());
    }


}
