package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_PlayDTMF">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_PlayDTMF
 * </a>
 * @author wavin
 */
public class PlayDTMFAction extends AmiAction {
    private static final String ACTION = "PlayDTMF";
    public PlayDTMFAction(String channel, String digit) {
        super(ACTION);
        addParams("Channel", channel);
        addParams("Digit", digit);
    }
}
