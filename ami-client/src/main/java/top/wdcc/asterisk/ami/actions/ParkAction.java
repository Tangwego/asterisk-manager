package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Park">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Park
 * </a>
 * @author wavin
 */
public class ParkAction extends AmiAction {
    private static final String ACTION = "Park";

    public ParkAction(String channel, String channel2, long timeout, String parkinglot) {
        super(ACTION);
        addParams("Channel", channel);
        addParams("Channel2", channel2);
        addParams("Timeout", String.valueOf(timeout));
        addParams("Parkinglot", parkinglot);
    }
}
