package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_CoreShowChannels">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_CoreShowChannels
 * </a>
 * @author wavin
 */
public class CoreShowChannelsAction extends AmiAction {
    private static final String ACTION = "CoreShowChannels";

    public CoreShowChannelsAction() {
        super(ACTION);
    }
}
