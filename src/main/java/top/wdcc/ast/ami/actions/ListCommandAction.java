package top.wdcc.ast.ami.actions;

import top.wdcc.ast.ami.AmiAction;

/**
 * 展示所有命令
 *
 * @author Wavin
 */
public class ListCommandAction extends AmiAction {
    private static final String ACTION = "listcommands";
    public ListCommandAction() {
        super(ACTION);
    }
}
