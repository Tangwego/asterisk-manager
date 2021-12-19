package top.wdcc.asterisk.ami.actions;

import top.wdcc.asterisk.ami.Tech;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_QueueAdd">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_QueueAdd
 * </a>
 * @author wavin
 */
public class QueueAddAction extends AmiAction {
    private static final String ACTION = "QueueAdd";
    public QueueAddAction(String queue, Tech interfaceType, Number penalty, boolean paused, String memberName) {
        this(queue, interfaceType, penalty, paused, memberName, null);
    }
    public QueueAddAction(String queue, Tech interfaceType, Number penalty, boolean paused, String memberName, Tech stateInterfaceType) {
        super(ACTION);
        addParams("Queue", queue);
        addParams("Interface", interfaceType.name());
        addParams("Penalty", String.valueOf(penalty));
        addParams("Paused", String.valueOf(paused));
        addParams("MemberName", memberName);
        addParams("StateInterface", stateInterfaceType.name());
    }
}
