package top.wdcc.asterisk.agi.commands;

public class SpeechActivateGrammarCommand extends AbstractSpeechCommand {

    private static final String TYPE = "ACTIVATE GRAMMAR";

    public SpeechActivateGrammarCommand(String grammarName) {
        super(TYPE);
        addArgument(grammarName);
    }
}
