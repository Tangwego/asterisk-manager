package top.wdcc.asterisk.agi.commands;

public class SetExtensionCommand extends AbstractSetCommand {
    private static final String TYPE = "EXTENSION";

    public SetExtensionCommand(String extension) {
        super(TYPE);
        addArgument(extension);
    }
}
