package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_GetConfig">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_GetConfig
 * </a>
 * @author wavin
 */
public class GetConfigAction extends AmiAction {

    private static final String ACTION = "GetConfig";

    public GetConfigAction(String fileName, String category) {
        super(ACTION);
        addParams("FileName", fileName);
        addParams("Category", category);
    }
}
