package top.wdcc.asterisk.ami.actions;

import top.wdcc.asterisk.ami.Tech;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_QueuePenalty">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_QueuePenalty
 * </a>
 * @author wavin
 */
public class QueuePenaltyAction extends AmiAction {
    private static final String ACTION = "QueuePenalty";

    public QueuePenaltyAction(String queue, Tech interfaceType, Number penalty) {
        super(ACTION);
        addParams("Queue", queue);
        addParams("Interface", interfaceType.name());
        addParams("Penalty", String.valueOf(penalty));
    }
}
