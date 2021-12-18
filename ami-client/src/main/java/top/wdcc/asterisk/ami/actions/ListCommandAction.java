package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_ListCommands">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_ListCommands
 * </a>
 * @author wavin
 */
public class ListCommandAction extends AmiAction {
    private static final String ACTION = "listcommands";
    public ListCommandAction() {
        super(ACTION);
    }
}
