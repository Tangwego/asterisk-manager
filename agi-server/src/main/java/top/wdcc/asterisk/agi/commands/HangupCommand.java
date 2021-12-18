package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_hangup">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_hangup
 *     </a>
 * @author wavin
 */
public class HangupCommand extends AbstractCommand {
    private static final String COMMAND = "HANGUP";

    public HangupCommand() {
        this(null);
    }

    public HangupCommand(String channelName) {
        super(COMMAND);
        addArgument(channelName);
    }
}
