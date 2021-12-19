package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_UnpauseMonitor">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_UnpauseMonitor
 * </a>
 * @author wavin
 */
public class UnpauseMonitorAction extends AmiAction {
    private static final String ACTION = "UnpauseMonitor";
    public UnpauseMonitorAction(String channel) {
        super(ACTION);
        addParams("Channel", channel);
    }
}
