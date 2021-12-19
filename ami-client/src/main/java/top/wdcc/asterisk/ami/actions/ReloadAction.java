package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Reload">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Reload
 * </a>
 * @author wavin
 */
public class ReloadAction extends AmiAction {
    private static final String ACTION = "Reload";

    public ReloadAction(String moduleName) {
        super(ACTION);
        addParams("Module", moduleName);
    }
}
