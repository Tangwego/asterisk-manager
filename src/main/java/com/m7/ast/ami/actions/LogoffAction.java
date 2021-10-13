package com.m7.ast.ami.actions;

import com.m7.ast.ami.transport.AmiAction;

/**
 * 登出ami
 *
 * @author TANG
 */
public class LogoffAction extends AmiAction {
    private static final String ACTION = "logoff";
    public LogoffAction() {
        super(ACTION);
    }
}
