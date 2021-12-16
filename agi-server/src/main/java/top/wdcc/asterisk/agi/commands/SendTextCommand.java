package top.wdcc.asterisk.agi.commands;

public class SendTextCommand extends AbstractSendCommand {
    private static final String TYPE = "TEXT";

    public SendTextCommand(String text) {
        super(TYPE);
        addArgument(text);
    }
}
