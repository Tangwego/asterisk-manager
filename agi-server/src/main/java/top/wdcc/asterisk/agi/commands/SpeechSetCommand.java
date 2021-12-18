package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_speech+set">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_speech+set
 *     </a>
 * @author wavin
 */
public class SpeechSetCommand extends AbstractSpeechCommand {

    private static final String TYPE = "SET";

    public SpeechSetCommand(String name, String value) {
        super(TYPE);
        addArgument(name, value);
    }
}

