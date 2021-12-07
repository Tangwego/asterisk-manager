package top.wdcc.asterisk.ami.actions;

import top.wdcc.asterisk.ami.AmiAction;

/**
 * 登录ami
 *
 * @author Wavin
 */
public class LoginAction extends AmiAction {
    private static final String ACTION = "login";
    public LoginAction(String username, String secret) {
        super(ACTION);
        addParams("Username", username);
        addParams("Secret", secret);
    }
}
