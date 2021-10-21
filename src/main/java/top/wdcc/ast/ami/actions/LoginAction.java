package top.wdcc.ast.ami.actions;

import top.wdcc.ast.ami.AmiAction;

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
