package top.wdcc.asterisk.agi.commands;

public class DatabaseDelCommand extends AbstractDatabaseCommand {
    private static final String TYPE = "DEL";

    public DatabaseDelCommand(String family, String key) {
        super(TYPE);
        addArgument(family, key);
    }
}
