package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Ping">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Ping
 * </a>
 * @author wavin
 */
public class PingAction extends AmiAction {
    private static final String ACTION = "Ping";
    public PingAction() {
        super(ACTION);
    }
}
