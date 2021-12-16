package top.wdcc.asterisk.agi.commands;

public class DatabaseGetCommand extends AbstractDatabaseCommand {
    private static final String TYPE = "GET";

    public DatabaseGetCommand(String family, String key) {
        super(TYPE);
        addArgument(family, key);
    }
}
