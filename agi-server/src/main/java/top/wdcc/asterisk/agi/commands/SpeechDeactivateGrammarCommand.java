package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_speech+deactivate+grammar">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_speech+deactivate+grammar
 *     </a>
 * @author wavin
 */
public class SpeechDeactivateGrammarCommand extends AbstractSpeechCommand {

    private static final String TYPE = "DEACTIVATE GRAMMAR";

    public SpeechDeactivateGrammarCommand(String grammarName) {
        super(TYPE);
        addArgument(grammarName);
    }
}
