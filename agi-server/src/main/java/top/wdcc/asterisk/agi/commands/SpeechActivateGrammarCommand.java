package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_speech+activate+grammar">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_speech+activate+grammar
 *     </a>
 * @author wavin
 */
public class SpeechActivateGrammarCommand extends AbstractSpeechCommand {

    private static final String TYPE = "ACTIVATE GRAMMAR";

    public SpeechActivateGrammarCommand(String grammarName) {
        super(TYPE);
        addArgument(grammarName);
    }
}
