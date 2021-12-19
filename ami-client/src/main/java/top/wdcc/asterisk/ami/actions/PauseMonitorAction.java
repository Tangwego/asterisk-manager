package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_PauseMonitor">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_PauseMonitor
 * </a>
 * @author wavin
 */
public class PauseMonitorAction extends AmiAction {
    private static final String ACTION = "PauseMonitor";
    public PauseMonitorAction(String channel) {
        super(ACTION);
        addParams("Channel", channel);
    }
}
