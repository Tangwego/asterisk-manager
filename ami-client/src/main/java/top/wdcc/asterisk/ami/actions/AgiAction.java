package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_AGI">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_AGI
 * </a>
 * @author wavin
 */
public class AgiAction extends AmiAction {
    private static final String ACTION = "Agi";

    public AgiAction(String channel, String command) {
        super(ACTION);
        addParams("Channel", channel);
        addParams("Command", command);
        addParams("CommandId", getId());
    }
}
