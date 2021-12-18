package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_speech+unload+grammar">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_speech+unload+grammar
 *     </a>
 * @author wavin
 */
public class SpeechUnloadGrammarCommand extends AbstractSpeechCommand {

    private static final String TYPE = "UNLOAD GRAMMAR";

    public SpeechUnloadGrammarCommand(String grammarName) {
        super(TYPE);
        addArgument(grammarName);
    }
}

