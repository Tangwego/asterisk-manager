package com.m7.ast.ami.actions;

import com.m7.ast.ami.transport.AmiAction;

/**
 * 登录ami
 *
 * @author TANG
 */
public class LoginAction extends AmiAction {
    private static final String ACTION = "login";
    public LoginAction(String username, String secret) {
        super(ACTION);
        addParams("Username", username);
        addParams("Secret", secret);
    }
}
