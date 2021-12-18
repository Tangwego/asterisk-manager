package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_send+text">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_send+text
 *     </a>
 * @author wavin
 */
public class SendTextCommand extends AbstractSendCommand {
    private static final String TYPE = "TEXT";

    public SendTextCommand(String text) {
        super(TYPE);
        addArgument(text);
    }
}
