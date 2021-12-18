package top.wdcc.asterisk.agi.commands;
import top.wdcc.asterisk.agi.AgiDefaultValue;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_speech+recognize">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_speech+recognize
 *     </a>
 * @author wavin
 */
public class SpeechRecognizeCommand extends AbstractSpeechCommand {

    private static final String TYPE = "RECOGNIZE";

    public SpeechRecognizeCommand(String prompt){
        this(prompt, AgiDefaultValue.DEFAULT_TIMEOUT, AgiDefaultValue.DEFAULT_OFFSET);
    }

    public SpeechRecognizeCommand(String prompt, long timeout, int offset) {
        super(TYPE);
        addArgument(prompt, String.valueOf(timeout), String.valueOf(offset));
    }
}

