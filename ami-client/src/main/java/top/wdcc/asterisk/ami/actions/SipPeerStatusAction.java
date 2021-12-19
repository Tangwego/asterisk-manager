package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_SIPpeerstatus">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_SIPpeerstatus
 * </a>
 * @author wavin
 */
public class SipPeerStatusAction extends AmiAction {
    private static final String ACTION = "SIPPeerStatus";

    public SipPeerStatusAction(){
        this(null);
    }

    public SipPeerStatusAction(String peer) {
        super(ACTION);
        addParams("Peer", peer);
    }
}
