package top.wdcc.asterisk.ami.apps;

public class AgentLogin extends AbstractApplication {
    private static final String APPLICATION_NAME = "AgentLogin";

    public AgentLogin(){
        this(null);
    }

    public AgentLogin(String agentNo, String ... options){
        super(APPLICATION_NAME);
        addOptions(agentNo);
        addOptions(options);
    }
}
