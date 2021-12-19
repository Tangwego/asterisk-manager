package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Getvar">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Getvar
 * </a>
 * @author wavin
 */
public class GetVarAction extends AmiAction {

    private static final String ACTION = "Getvar";

    public GetVarAction(String channel, String key) {
        super(ACTION);
        addParams("Channel", channel);
        addParams("Variable", key);
    }
}
