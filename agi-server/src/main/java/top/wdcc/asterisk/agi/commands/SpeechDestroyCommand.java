package top.wdcc.asterisk.agi.commands;

public class SpeechDestroyCommand extends AbstractSpeechCommand {

    private static final String TYPE = "DESTROY";

    public SpeechDestroyCommand() {
        super(TYPE);
    }
}
