package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Events">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Events
 * </a>
 * @author wavin
 */
public class HangupAction extends AmiAction {

    private static final String ACTION = "Hangup";

    public HangupAction(String channel) {
        this(channel, ActionDefaultValue.DEFAULT_CAUSE);
    }

    public HangupAction(String channel, int cause) {
        super(ACTION);
        addParams("Channel", channel);
        addParams("Cause", String.valueOf(cause));
    }
}
