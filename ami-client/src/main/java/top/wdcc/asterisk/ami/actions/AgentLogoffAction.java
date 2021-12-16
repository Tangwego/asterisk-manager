package top.wdcc.asterisk.ami.actions;

public class AgentLogoffAction extends AmiAction {

    private static final String ACTION = "agentlogoff";

    public AgentLogoffAction(String agent, boolean soft) {
        super(ACTION);
        addParams("agent", agent);
        addParams("soft", String.valueOf(soft));
    }
}
