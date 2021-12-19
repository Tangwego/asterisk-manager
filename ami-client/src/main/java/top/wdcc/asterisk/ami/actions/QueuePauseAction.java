package top.wdcc.asterisk.ami.actions;

import top.wdcc.asterisk.ami.Tech;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_QueuePause">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_QueuePause
 * </a>
 * @author wavin
 */
public class QueuePauseAction extends AmiAction {
    private static final String ACTION = "QueuePause";

    public QueuePauseAction(String queue, Tech interfaceType, boolean paused, String reason) {
        super(ACTION);
        addParams("Queue", queue);
        addParams("Interface", interfaceType.name());
        addParams("Paused", String.valueOf(paused));
        addParams("Reason", reason);
    }
}
