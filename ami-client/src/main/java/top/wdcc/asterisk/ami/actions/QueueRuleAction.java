package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_QueueRule">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_QueueRule
 * </a>
 * @author wavin
 */
public class QueueRuleAction extends AmiAction {
    private static final String ACTION = "QueueRule";

    public QueueRuleAction(String ruleName) {
        super(ACTION);
        addParams("Rule", ruleName);
    }
}
