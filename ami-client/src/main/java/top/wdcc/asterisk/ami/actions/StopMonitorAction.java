package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_StopMonitor">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_StopMonitor
 * </a>
 * @author wavin
 */
public class StopMonitorAction extends AmiAction {
    private static final String ACTION = "StopMonitor";


    public StopMonitorAction(String channel) {
        super(ACTION);
        addParams("Channel", channel);
    }
}
