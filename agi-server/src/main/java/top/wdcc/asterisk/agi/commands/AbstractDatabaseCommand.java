package top.wdcc.asterisk.agi.commands;

/**
 * this is a kind of database command implementation for {@code AgiCommand}
 * @see top.wdcc.asterisk.agi.commands.AbstractCommand
 * @see top.wdcc.asterisk.agi.commands.AgiCommand
 * @author wavin
 */
public class AbstractDatabaseCommand extends AbstractCommand {

    private static final String COMMAND = "DATABASE";

    public AbstractDatabaseCommand(String type) {
        super(String.format("%s %s", COMMAND, type));
    }
}
