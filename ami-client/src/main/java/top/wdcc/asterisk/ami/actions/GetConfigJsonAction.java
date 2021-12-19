package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_GetConfigJSON">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_GetConfigJSON
 * </a>
 * @author wavin
 */
public class GetConfigJsonAction extends AmiAction {

    private static final String ACTION = "GetConfigJSON";

    public GetConfigJsonAction(String fileName, String category) {
        super(ACTION);
        addParams("FileName", fileName);
    }
}
