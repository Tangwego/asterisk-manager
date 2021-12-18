package top.wdcc.asterisk.agi.commands;

/**
 * this is a kind of set command implementation for {@code AgiCommand}
 * @see top.wdcc.asterisk.agi.commands.AbstractCommand
 * @see top.wdcc.asterisk.agi.commands.AgiCommand
 * @author wavin
 */
public class AbstractSetCommand extends AbstractCommand {
    private static final String COMMAND = "SET";

    public AbstractSetCommand(String type) {
        super(String.format("%s %s", COMMAND, type));
    }
}
