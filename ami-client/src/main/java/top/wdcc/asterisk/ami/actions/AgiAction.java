package top.wdcc.asterisk.ami.actions;

public class AgiAction extends AmiAction {
    private static final String ACTION = "agi";

    public AgiAction(String channel, String command) {
        super(ACTION);
        addParams("channel", channel);
        addParams("command", command);
        addParams("commandid", getId());
    }
}
