package top.wdcc.asterisk.agi.commands;

public class SpeechCreateCommand extends AbstractSpeechCommand {

    private static final String TYPE = "CREATE";

    public SpeechCreateCommand(String engine) {
        super(TYPE);
        addArgument(engine);
    }
}
