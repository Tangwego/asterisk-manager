package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_speech+load+grammar">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_speech+load+grammar
 *     </a>
 * @author wavin
 */
public class SpeechLoadGrammarCommand extends AbstractSpeechCommand {

    private static final String TYPE = "LOAD GRAMMAR";

    public SpeechLoadGrammarCommand(String grammarName, String grammarPath) {
        super(TYPE);
        addArgument(grammarName, grammarPath);
    }
}
