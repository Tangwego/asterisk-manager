package top.wdcc.ast.ami.actions;

import top.wdcc.ast.ami.AmiAction;

/**
 * @author Wavin
 */
public class PingAction extends AmiAction {
    private static final String ACTION = "ping";
    public PingAction() {
        super(ACTION);
    }
}
