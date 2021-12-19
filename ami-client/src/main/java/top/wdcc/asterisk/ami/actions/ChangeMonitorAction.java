package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_ChangeMonitor">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_ChangeMonitor
 * </a>
 * @author wavin
 */
public class ChangeMonitorAction extends AmiAction {

    private static final String ACTION = "ChangeMonitor";

    public ChangeMonitorAction(String channel, String fileName) {
        super(ACTION);
        addParams("Channel", channel);
        addParams("FileName", fileName);
    }
}
