package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_ParkedCalls">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_ParkedCalls
 * </a>
 * @author wavin
 */
public class ParkedCallsAction extends AmiAction {
    private static final String ACTION = "ParkedCalls";
    public ParkedCallsAction() {
        super(ACTION);
    }
}
