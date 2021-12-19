package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_QueueStatus">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_QueueStatus
 * </a>
 * @author wavin
 */
public class QueueStatusAction extends AmiAction {
    private static final String ACTION = "QueueStatus";

    public QueueStatusAction(String queue, String member) {
        super(ACTION);
        addParams("Queue", queue);
        addParams("Member", member);
    }
}
