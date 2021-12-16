package top.wdcc.asterisk.agi.commands;

public class GetVariableCommand extends AbstractGetCommand {
    private static final String TYPE = "VARIABLE";

    public GetVariableCommand(String key) {
        super(TYPE);
        addArgument(key);
    }
}
