package top.wdcc.asterisk.agi.commands;

public class SpeechSetCommand extends AbstractSpeechCommand {

    private static final String TYPE = "SET";

    public SpeechSetCommand(String name, String value) {
        super(TYPE);
        addArgument(name, value);
    }
}

