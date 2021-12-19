package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Bridge">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Bridge
 * </a>
 * @author wavin
 */
public class BridgeAction extends AmiAction {
    private static final String ACTION = "Bridge";

    public BridgeAction(String channel1, String channel2){
        this(channel1, channel2, false);
    }
    public BridgeAction(String channel1, String channel2, boolean tone) {
        super(ACTION);
        addParams("Channel1", channel1);
        addParams("Channel2", channel2);
        addParams("Tone", tone?"yes":"no");
    }
}
