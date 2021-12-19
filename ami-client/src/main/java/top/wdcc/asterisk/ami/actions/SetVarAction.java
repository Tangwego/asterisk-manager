package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Setvar">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Setvar
 * </a>
 * @author wavin
 */
public class SetVarAction extends AmiAction {

    private static final String ACTION = "Setvar";

    public SetVarAction(String channel, String key, Object value) {
        super(ACTION);
        addParams("Channel", channel);
        addParams("Variable", key);
        addParams("Value", String.valueOf(value));
    }
}
