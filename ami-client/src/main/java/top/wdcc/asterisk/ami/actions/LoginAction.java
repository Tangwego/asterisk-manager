package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Login">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Login
 * </a>
 * @author wavin
 */
public class LoginAction extends AmiAction {
    private static final String ACTION = "Login";
    public LoginAction(String username, String secret) {
        super(ACTION);
        addParams("Username", username);
        addParams("Secret", secret);
    }
}
