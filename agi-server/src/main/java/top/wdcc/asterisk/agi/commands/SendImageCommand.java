package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_send+image">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_send+image
 *     </a>
 * @author wavin
 */
public class SendImageCommand extends AbstractSendCommand {

    private static final String TYPE = "IMAGE";

    public SendImageCommand(String image) {
        super(TYPE);
        addArgument(image);
    }
}
