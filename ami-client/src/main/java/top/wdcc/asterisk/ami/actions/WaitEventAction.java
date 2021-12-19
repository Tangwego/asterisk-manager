package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_WaitEvent">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_WaitEvent
 * </a>
 * @author wavin
 */
public class WaitEventAction extends AmiAction {

    private static final String ACTION = "WaitEvent";

    public WaitEventAction(long timeout) {
        super(ACTION);
        addParams("Timeout", String.valueOf(timeout));
    }
}
