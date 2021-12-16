package top.wdcc.asterisk.agi.commands;

public class SpeechLoadGrammarCommand extends AbstractSpeechCommand {

    private static final String TYPE = "LOAD GRAMMAR";

    public SpeechLoadGrammarCommand(String grammarName, String grammarPath) {
        super(TYPE);
        addArgument(grammarName, grammarPath);
    }
}
