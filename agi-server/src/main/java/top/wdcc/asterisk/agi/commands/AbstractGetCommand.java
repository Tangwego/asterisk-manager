package top.wdcc.asterisk.agi.commands;

/**
 * this is a kind of get command implementation for {@code AgiCommand}
 * @see top.wdcc.asterisk.agi.commands.AbstractCommand
 * @see top.wdcc.asterisk.agi.commands.AgiCommand
 * @author wavin
 */
public class AbstractGetCommand extends AbstractCommand {
    private static final String COMMAND = "GET";
    public AbstractGetCommand(String type) {
        super(String.format("%s %s", COMMAND, type));
    }
}
