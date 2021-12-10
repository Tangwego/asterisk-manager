package top.wdcc.asterisk.agi;

import io.netty.channel.Channel;
import top.wdcc.asterisk.agi.commands.AgiCommand;
import top.wdcc.asterisk.agi.commands.AnswerCommand;
import top.wdcc.asterisk.agi.commands.HangupCommand;
import top.wdcc.asterisk.agi.commands.StreamFileCommand;

import java.util.ArrayList;
import java.util.List;

public class AgiChannel {
    private AgiMessage message;

    private Channel channel;

    private AgiServerHandler handler;

    public AgiChannel(AgiMessage message, Channel channel, AgiServerHandler handler) {
        this.message = message;
        this.channel = channel;
        this.handler = handler;
    }

    public AgiMessage answer(){
        return handler.sendCommand(channel, new AnswerCommand());
    }

    public AgiMessage streamFile(String file) {
        return handler.sendCommand(channel, new StreamFileCommand(file));
    }

    public String getAgiScript(){
        return message.getParam(AgiMessage.AGI_NETWORK_SCRIPT);
    }

    public List<String> getArguments(){
        List<String> result = new ArrayList<>();
        message.getParams().forEach((name, param)-> {
            if (name.contains(AgiMessage.AGI_ARGS)) {
                result.add(param);
            }
        });
        return result;
    }

    public AgiMessage sendCommand(String cmd){
        return handler.sendCommand(channel, new AgiCommand() {
            @Override
            public String getCommandString() {
                return cmd;
            }
        });
    }

    public AgiMessage close(){
        return handler.sendCommand(channel, new HangupCommand());
    }
}
