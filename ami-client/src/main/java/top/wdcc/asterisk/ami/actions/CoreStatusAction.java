package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_CoreStatus">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_CoreStatus
 * </a>
 * @author wavin
 */
public class CoreStatusAction extends AmiAction {

    private static final String ACTION = "CoreStatus";

    public CoreStatusAction() {
        super(ACTION);
    }
}
