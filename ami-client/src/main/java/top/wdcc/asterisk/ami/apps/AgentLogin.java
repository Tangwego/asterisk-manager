package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications
 * </a>
 * @author wavin
 */
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
