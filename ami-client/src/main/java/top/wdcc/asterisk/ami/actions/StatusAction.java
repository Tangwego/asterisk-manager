package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Status">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Status
 * </a>
 * @author wavin
 */
public class StatusAction extends AmiAction {
    private static final String ACTION = "Status";

    public StatusAction(){
        this(null);
    }

    public StatusAction(String channel, Object ... variables) {
        super(ACTION);
        addParams("Channel", channel);
        if (variables != null && variables.length > 0) {
            for (Object o: variables) {
                appendParams("Variables", String.valueOf(o));
            }
        }
    }
}
