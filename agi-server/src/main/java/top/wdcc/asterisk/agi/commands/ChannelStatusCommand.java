package top.wdcc.asterisk.agi.commands;

public class ChannelStatusCommand extends AbstractCommand {

    private static final String COMMAND = "CHANNEL STATUS";

    public ChannelStatusCommand(String channelName) {
        super(COMMAND);
        addArgument(channelName);
    }
}
