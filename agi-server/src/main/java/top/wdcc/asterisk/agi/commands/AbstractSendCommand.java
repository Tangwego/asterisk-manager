package top.wdcc.asterisk.agi.commands;

/**
 * this is a kind of send command implementation for {@code AgiCommand}
 * @see top.wdcc.asterisk.agi.commands.AbstractCommand
 * @see top.wdcc.asterisk.agi.commands.AgiCommand
 * @author wavin
 */
public class AbstractSendCommand extends AbstractCommand {

    private static final String COMMAND = "SEND";

    public AbstractSendCommand(String type) {
        super(String.format("%s %s", COMMAND, type));
    }
}
