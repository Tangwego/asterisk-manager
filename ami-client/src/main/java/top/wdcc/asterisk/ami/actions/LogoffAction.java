package top.wdcc.asterisk.ami.actions;

import top.wdcc.asterisk.ami.AmiAction;

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
