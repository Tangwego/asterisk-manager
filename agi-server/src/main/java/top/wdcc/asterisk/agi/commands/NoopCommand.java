package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_noop">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_noop
 *     </a>
 * @author wavin
 */
public class NoopCommand extends AbstractCommand {

    private static final String COMMAND = "NOOP";

    public NoopCommand() {
        super(COMMAND);
    }
}
