package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_verbose">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_verbose
 *     </a>
 * @author wavin
 */
public class VerboseCommand extends AbstractCommand {

    private static final String COMMAND = "VERBOSE";

    public VerboseCommand(String message, int level) {
        super(COMMAND);
        addArgument(message, String.valueOf(level));
    }
}
