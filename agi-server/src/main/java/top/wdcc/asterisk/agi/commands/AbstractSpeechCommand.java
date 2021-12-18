package top.wdcc.asterisk.agi.commands;

/**
 * this is a kind of speech command implementation for {@code AgiCommand}
 * @see top.wdcc.asterisk.agi.commands.AbstractCommand
 * @see top.wdcc.asterisk.agi.commands.AgiCommand
 * @author wavin
 */
public class AbstractSpeechCommand extends AbstractCommand {

    private static final String COMMAND = "SPEECH";

    public AbstractSpeechCommand(String type) {
        super(String.format("%s %s", COMMAND, type));
    }
}

