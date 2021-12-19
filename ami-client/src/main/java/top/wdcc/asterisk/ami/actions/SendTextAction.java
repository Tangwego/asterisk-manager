package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_SendText">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_SendText
 * </a>
 * @author wavin
 */
public class SendTextAction extends AmiAction {
    private static final String ACTION = "SendText";

    public SendTextAction(String channel, String message) {
        super(ACTION);
        addParams("Channel", channel);
        addParams("Message", message);
    }
}
