package top.wdcc.asterisk.agi.commands;

public class DatabasePutCommand extends AbstractDatabaseCommand {
    private static final String TYPE = "PUT";

    public DatabasePutCommand(String family, String key, String value) {
        super(TYPE);
        addArgument(family, key, value);
    }
}
