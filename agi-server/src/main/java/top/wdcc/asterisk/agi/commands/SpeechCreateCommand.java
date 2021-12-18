package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_speech+create">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_speech+create
 *     </a>
 * @author wavin
 */
public class SpeechCreateCommand extends AbstractSpeechCommand {

    private static final String TYPE = "CREATE";

    public SpeechCreateCommand(String engine) {
        super(TYPE);
        addArgument(engine);
    }
}
