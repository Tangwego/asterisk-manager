package top.wdcc.asterisk.agi.commands;

public class DatabaseDeltreeCommand extends AbstractDatabaseCommand {
    private static final String TYPE = "DELTREE";

    public DatabaseDeltreeCommand(String family, String keytree) {
        super(TYPE);
        addArgument(family, keytree);
    }
}
