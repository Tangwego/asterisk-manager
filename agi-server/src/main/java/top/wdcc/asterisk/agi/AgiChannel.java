package top.wdcc.asterisk.agi;

import io.netty.channel.Channel;
import top.wdcc.asterisk.agi.commands.*;
import top.wdcc.asterisk.ami.apps.Application;
import top.wdcc.asterisk.ami.apps.Hangup;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

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

    public AgiMessage exec(Application application) {
        return handler.sendCommand(channel, new ExecCommand(application));
    }

    public AgiMessage sayNumber(int number) {
        return handler.sendCommand(channel, new SayNumberCommand(number));
    }

    public AgiMessage sayPhonetic(String phoneNumber) {
        return handler.sendCommand(channel, new SayPhoneticCommand(phoneNumber));
    }

    public AgiMessage sayAlpha(String alpha) {
        return handler.sendCommand(channel, new SayAlphaCommand(alpha));
    }

    public AgiMessage sayDigits(String digits) {
        return handler.sendCommand(channel, new SayDigitsCommand(digits));
    }

    public AgiMessage sayDate(Date date) {
        return handler.sendCommand(channel, new SayDateCommand(SayDateCommand.TYPE_DATE, date));
    }

    public AgiMessage sayDateTime(Date date, String format, TimeZone timeZone) {
        return handler.sendCommand(channel, new SayDateCommand(SayDateCommand.TYPE_DATETIME, date, format, timeZone));
    }

    public AgiMessage sayTime(Date date) {
        return handler.sendCommand(channel, new SayDateCommand(SayDateCommand.TYPE_TIME, date));
    }

    public AgiMessage setExtension(String extension) {
        return handler.sendCommand(channel, new SetExtensionCommand(extension));
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

    public String getUniqueId(){
        return message.getParam(AgiMessage.AGI_UNIQUEID);
    }

    public String getChannelName(){
        return message.getParam(AgiMessage.AGI_CHANNEL);
    }

    public AgiMessage sendCommand(String cmd){
        return handler.sendCommand(channel, new AgiCommand() {
            @Override
            public String getCommandString() {
                return cmd;
            }
        });
    }

    public void hangup(){
        handler.sendCommand(channel, new ExecCommand(new Hangup()));
    }

    public AgiMessage close(){
        return handler.sendCommand(channel, new HangupCommand(getChannelName()));
    }
}
