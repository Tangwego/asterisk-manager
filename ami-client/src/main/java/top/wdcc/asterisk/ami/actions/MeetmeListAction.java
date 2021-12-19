package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_MeetmeList">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_MeetmeList
 * </a>
 * @author wavin
 */
public class MeetmeListAction extends AmiAction {
    private static final String ACTION = "MeetmeList";

    public MeetmeListAction() {
        this("");
    }

    public MeetmeListAction(String conference) {
        super(ACTION);
        addParams("Conference", conference);
    }
}
