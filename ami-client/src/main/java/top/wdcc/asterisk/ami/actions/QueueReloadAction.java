package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_QueueReload">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_QueueReload
 * </a>
 * @author wavin
 */
public class QueueReloadAction extends AmiAction {
    private static final String ACTION = "QueueReload";

    public QueueReloadAction(String queue, boolean reloadMembers, boolean reloadRules, boolean reloadOtherOptions) {
        super(ACTION);
        addParams("Queue", queue);
        addParams("Members", String.valueOf(reloadMembers));
        addParams("Rules", String.valueOf(reloadRules));
        addParams("Parameters", String.valueOf(reloadOtherOptions));
    }
}
