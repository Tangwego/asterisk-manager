package top.wdcc.asterisk.ami.actions;

/**
 * 登录ami
 *
 * @author Wavin
 */
public class LoginAction extends AmiAction {
    private static final String ACTION = "login";
    public LoginAction(String username, String secret) {
        super(ACTION);
        addParams("username", username);
        addParams("secret", secret);
    }
}
