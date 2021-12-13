package top.wdcc.asterisk.agi;

import io.netty.channel.Channel;
import org.apache.commons.lang3.StringUtils;
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

    public AgiMessage answer() {
        return sendCommand(new AnswerCommand());
    }

    public AgiMessage exec(Application application) {
        return sendCommand(new ExecCommand(application));
    }

    public AgiMessage sayNumber(int number) {
        return sendCommand(new SayNumberCommand(number));
    }

    public AgiMessage sayPhonetic(String phoneNumber) {
        return sendCommand(new SayPhoneticCommand(phoneNumber));
    }

    public AgiMessage sayAlpha(String alpha) {
        return sendCommand(new SayAlphaCommand(alpha));
    }

    public AgiMessage sayDigits(String digits) {
        return sendCommand(new SayDigitsCommand(digits));
    }

    public AgiMessage sayDate(Date date) {
        return sendCommand(new SayDateCommand(SayDateCommand.TYPE_DATE, date));
    }

    public AgiMessage sayDateTime(Date date, String format, TimeZone timeZone) {
        return sendCommand(new SayDateCommand(SayDateCommand.TYPE_DATETIME, date, format, timeZone));
    }

    public AgiMessage sayTime(Date date) {
        return sendCommand(new SayDateCommand(SayDateCommand.TYPE_TIME, date));
    }

    public AgiMessage addExtension(String extension) {
        return sendCommand(new SetExtensionCommand(extension));
    }

    public AgiMessage streamFile(String file) {
        return sendCommand(new StreamFileCommand(file));
    }

    public String getAgiScript(){
        return message.getParam(AgiMessage.AGI_NETWORK_SCRIPT);
    }

    public List<String> getArguments(){
        List<String> result = new ArrayList<>();
        message.getParams().forEach((name, param)-> {
            if (StringUtils.startsWith(name, AgiMessage.AGI_ARGS)) {
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
        return sendCommand(() -> cmd);
    }

    public AgiMessage sendCommand(AgiCommand cmd){
        return handler.sendCommand(channel, cmd);
    }

    public void hangup(){
        sendCommand(new HangupCommand(getChannelName()));
    }

    public void close(){
        if (this.channel != null) {
            this.channel.closeFuture();
        }
    }
}
