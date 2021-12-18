package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_tdd+mode">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_tdd+mode
 *     </a>
 * @author wavin
 */
public class TDDModeCommand extends AbstractCommand {

    private static final String COMMAND = "TDD MODE";

    public TDDModeCommand(boolean on) {
        super(COMMAND);
        addArgument(on?"on":"false");
    }
}
