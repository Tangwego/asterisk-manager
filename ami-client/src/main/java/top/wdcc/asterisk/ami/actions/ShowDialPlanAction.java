package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_ShowDialPlan">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_ShowDialPlan
 * </a>
 * @author wavin
 */
public class ShowDialPlanAction extends AmiAction {

    private static final String ACTION = "ShowDialPlan";

    public ShowDialPlanAction() {
        this(null, null);
    }

    public ShowDialPlanAction(String extension) {
        this(extension, null);
    }

    public ShowDialPlanAction(String extension, String context) {
        super(ACTION);
        addParams("Extension", extension);
        addParams("Context", context);
    }
}
