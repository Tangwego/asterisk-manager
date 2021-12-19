package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_AbsoluteTimeout">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_AbsoluteTimeout
 * </a>
 * @author wavin
 */
public class AbsoluteTimeoutAction extends AmiAction {
    private static final String ACTION = "AbsoluteTimeout";

    public AbsoluteTimeoutAction(String channel, long timeout) {
        super(ACTION);
        addParams("Channel", channel);
        addParams("Timeout", String.valueOf(timeout));
    }
}
