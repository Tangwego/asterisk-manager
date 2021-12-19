package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_SIPshowpeer">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_SIPshowpeer
 * </a>
 * @author wavin
 */
public class SipShowPeerAction extends AmiAction {
    private static final String ACTION = "SIPShowPeer";

    public SipShowPeerAction(){
        this(null);
    }

    public SipShowPeerAction(String peer) {
        super(ACTION);
        addParams("Peer", peer);
    }
}
