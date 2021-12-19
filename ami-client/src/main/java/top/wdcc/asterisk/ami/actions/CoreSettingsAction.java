package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_CoreSettings">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_CoreSettings
 * </a>
 * @author wavin
 */
public class CoreSettingsAction extends AmiAction {
    private static final String ACTION = "CoreSettings";

    public CoreSettingsAction() {
        super(ACTION);
    }
}
