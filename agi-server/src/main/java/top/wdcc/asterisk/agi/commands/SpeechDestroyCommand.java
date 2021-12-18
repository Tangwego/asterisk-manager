package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_speech+destroy">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_speech+destroy
 *     </a>
 * @author wavin
 */
public class SpeechDestroyCommand extends AbstractSpeechCommand {

    private static final String TYPE = "DESTROY";

    public SpeechDestroyCommand() {
        super(TYPE);
    }
}
