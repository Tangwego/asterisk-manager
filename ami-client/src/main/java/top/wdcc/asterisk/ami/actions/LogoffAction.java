package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Logoff">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Logoff
 * </a>
 * @author wavin
 */
public class LogoffAction extends AmiAction {
    private static final String ACTION = "logoff";
    public LogoffAction() {
        super(ACTION);
    }
}
