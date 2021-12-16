package top.wdcc.asterisk.agi.commands;

public class GetFullVariableCommand extends AbstractGetCommand {

    private static final String TYPE = "FULL VARIABLE";

    public GetFullVariableCommand(String name, String channelName) {
        super(TYPE);
        addArgument(name, channelName);
    }
}
