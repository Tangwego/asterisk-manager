package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_QueueReset">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_QueueReset
 * </a>
 * @author wavin
 */
public class QueueResetAction extends AmiAction {
    private static final String ACTION = "QueueReset";

    public QueueResetAction(String queue) {
        super(ACTION);
        addParams("Queue", queue);
    }
}
