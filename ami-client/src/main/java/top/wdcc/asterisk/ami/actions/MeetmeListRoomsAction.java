package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_MeetmeListRooms">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_MeetmeListRooms
 * </a>
 * @author wavin
 */
public class MeetmeListRoomsAction extends AmiAction {
    private static final String ACTION = "MeetmeListRooms";

    public MeetmeListRoomsAction() {
        super(ACTION);
    }
}
