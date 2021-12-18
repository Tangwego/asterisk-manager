package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_answer">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_answer
 *     </a>
 * @author wavin
 */
public class AnswerCommand extends AbstractCommand {
    private static final String COMMAND = "ANSWER";
    public AnswerCommand() {
        super(COMMAND);
    }
}
