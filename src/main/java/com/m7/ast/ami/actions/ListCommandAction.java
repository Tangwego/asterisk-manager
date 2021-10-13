package com.m7.ast.ami.actions;

import com.m7.ast.ami.transport.AmiAction;

/**
 * 展示所有命令
 *
 * @author TANG
 */
public class ListCommandAction extends AmiAction {
    private static final String ACTION = "listcommands";
    public ListCommandAction() {
        super(ACTION);
    }
}
