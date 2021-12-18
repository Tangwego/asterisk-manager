package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_asyncagi+break">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_asyncagi+break
 *     </a>
 * @author wavin
 */
public class AsyncAgiCommand extends AbstractCommand {
    private static final String COMMAND = "ASYNCAGI BREAK";

    public AsyncAgiCommand() {
        super(COMMAND);
    }
}
