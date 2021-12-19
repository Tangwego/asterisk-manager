package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_SIPpeers">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_SIPpeers
 * </a>
 * @author wavin
 */
public class SipPeersAction extends AmiAction {
    private static final String ACTION = "SIPPeers";

    public SipPeersAction() {
        super(ACTION);
    }
}
