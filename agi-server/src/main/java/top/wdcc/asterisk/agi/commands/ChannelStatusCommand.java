package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_channel+status">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_channel+status
 *     </a>
 * @author wavin
 */
public class ChannelStatusCommand extends AbstractCommand {

    private static final String COMMAND = "CHANNEL STATUS";

    public ChannelStatusCommand(String channelName) {
        super(COMMAND);
        addArgument(channelName);
    }
}
