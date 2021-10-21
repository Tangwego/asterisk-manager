package top.wdcc.ast.ami.actions;

import top.wdcc.ast.ami.AmiAction;

/**
 * 登出ami
 *
 * @author Wavin
 */
public class LogoffAction extends AmiAction {
    private static final String ACTION = "logoff";
    public LogoffAction() {
        super(ACTION);
    }
}
