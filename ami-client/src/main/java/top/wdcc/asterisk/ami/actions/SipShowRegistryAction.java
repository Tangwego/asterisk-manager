package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_SIPshowregistry">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_SIPshowregistry
 * </a>
 * @author wavin
 */
public class SipShowRegistryAction extends AmiAction {
    private static final String ACTION = "SIPShowRegistry";

    public SipShowRegistryAction() {
        super(ACTION);
    }
}
