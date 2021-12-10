package top.wdcc.asterisk.agi.commands;

public class SetContextCommand extends AbstractSetCommand {
    private static final String TYPE = "CONTEXT";

    public SetContextCommand(String context) {
        super(TYPE);
    }
}
