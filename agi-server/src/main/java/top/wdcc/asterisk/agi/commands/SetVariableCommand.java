package top.wdcc.asterisk.agi.commands;

public class SetVariableCommand extends AbstractSetCommand {
    private static final String TYPE = "VARIABLE";

    public SetVariableCommand(String key, String value) {
        super(TYPE);
        addArgument(key, value);
    }
}
