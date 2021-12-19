package top.wdcc.asterisk.ami.actions;

import top.wdcc.asterisk.ami.Tech;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_QueueRemove">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_QueueRemove
 * </a>
 * @author wavin
 */
public class QueueRemoveAction extends AmiAction {
    private static final String ACTION = "QueueRemove";

    public QueueRemoveAction(String queue, Tech interfaceType) {
        super(ACTION);
        addParams("Queue", queue);
        addParams("Interface", interfaceType.name());
    }
}
