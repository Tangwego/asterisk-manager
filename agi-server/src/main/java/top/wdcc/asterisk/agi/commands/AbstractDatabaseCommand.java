package top.wdcc.asterisk.agi.commands;

public class AbstractDatabaseCommand extends AbstractCommand {

    private static final String COMMAND = "DATABASE";

    public AbstractDatabaseCommand(String type) {
        super(String.format("%s %s", COMMAND, type));
    }
}
