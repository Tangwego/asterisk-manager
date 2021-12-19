package top.wdcc.asterisk.ami.actions;

import top.wdcc.asterisk.ami.Tech;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_QueueLog">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_QueueLog
 * </a>
 * @author wavin
 */
public class QueueLogAction extends AmiAction {
    private static final String ACTION = "QueueLog";

    public QueueLogAction(String queue, String eventName, String uniqueId, Tech interfaceType, String message) {
        super(ACTION);
        addParams("Queue", queue);
        addParams("Event", eventName);
        addParams("Uniqueid", uniqueId);
        addParams("Interface", interfaceType.name());
        addParams("Message", message);
    }
}
