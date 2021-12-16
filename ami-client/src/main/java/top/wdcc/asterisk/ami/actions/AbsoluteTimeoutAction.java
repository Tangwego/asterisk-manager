package top.wdcc.asterisk.ami.actions;

public class AbsoluteTimeoutAction extends AmiAction {
    private static final String ACTION = "absolutetimeout";

    public AbsoluteTimeoutAction(String channel, long timeout) {
        super(ACTION);
        addParams("channel", channel);
        addParams("timeout", String.valueOf(timeout));
    }
}
