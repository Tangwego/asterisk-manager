package top.wdcc.asterisk.agi.commands;

public class SpeechUnloadGrammarCommand extends AbstractSpeechCommand {

    private static final String TYPE = "UNLOAD GRAMMAR";

    public SpeechUnloadGrammarCommand(String grammarName) {
        super(TYPE);
        addArgument(grammarName);
    }
}

