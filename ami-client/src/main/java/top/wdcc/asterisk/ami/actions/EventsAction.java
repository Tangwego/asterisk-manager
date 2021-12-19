package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Events">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Events
 * </a>
 * @author wavin
 */
public class EventsAction extends AmiAction {

    private static final String ACTION = "Events";

    public EventsAction(String mask) {
        super(ACTION);
        addParams("EventMask", mask);
    }
}
