package top.wdcc.asterisk.agi.commands;
import top.wdcc.asterisk.agi.AgiDefaultValue;

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

