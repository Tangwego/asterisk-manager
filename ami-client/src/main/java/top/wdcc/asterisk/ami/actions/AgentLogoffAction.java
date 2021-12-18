package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_AgentLogoff">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_AgentLogoff
 * </a>
 * @author wavin
 */
public class AgentLogoffAction extends AmiAction {

    private static final String ACTION = "agentlogoff";

    public AgentLogoffAction(String agent, boolean soft) {
        super(ACTION);
        addParams("agent", agent);
        addParams("soft", String.valueOf(soft));
    }
}
