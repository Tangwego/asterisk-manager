package top.wdcc.asterisk.agi.commands;

/**
 * this is a kind of receive command implementation for {@code AgiCommand}
 * @see top.wdcc.asterisk.agi.commands.AbstractCommand
 * @see top.wdcc.asterisk.agi.commands.AgiCommand
 * @author wavin
 */
public class AbstractReceiveCommand extends AbstractCommand {
    private static final String COMMAND = "RECEIVE";

    public AbstractReceiveCommand(String type) {
        super(String.format("%s %s", COMMAND, type));
    }
}
