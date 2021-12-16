package top.wdcc.asterisk.agi.commands;

public class SpeechDeactivateGrammarCommand extends AbstractSpeechCommand {

    private static final String TYPE = "DEACTIVATE GRAMMAR";

    public SpeechDeactivateGrammarCommand(String grammarName) {
        super(TYPE);
        addArgument(grammarName);
    }
}
