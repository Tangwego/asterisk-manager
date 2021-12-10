package top.wdcc.asterisk.agi.commands;

public class HangupCommand extends AbstractCommand {
    private static final String COMMAND = "HANGUP";

    public HangupCommand() {
        this(null);
    }

    public HangupCommand(String channelName) {
        super(COMMAND);
        addArgument(channelName);
    }
}
