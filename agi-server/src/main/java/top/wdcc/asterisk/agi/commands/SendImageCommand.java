package top.wdcc.asterisk.agi.commands;

public class SendImageCommand extends AbstractSendCommand {

    private static final String TYPE = "IMAGE";

    public SendImageCommand(String image) {
        super(TYPE);
        addArgument(image);
    }
}
