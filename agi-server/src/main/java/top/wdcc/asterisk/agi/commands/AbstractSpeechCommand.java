package top.wdcc.asterisk.agi.commands;

public class AbstractSpeechCommand extends AbstractCommand {

    private static final String COMMAND = "SPEECH";

    public AbstractSpeechCommand(String type) {
        super(String.format("%s %s", COMMAND, type));
    }
}

