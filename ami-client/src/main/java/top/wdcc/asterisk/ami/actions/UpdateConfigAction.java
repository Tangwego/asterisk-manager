package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_UpdateConfig">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_UpdateConfig
 * </a>
 * @author wavin
 */
public class UpdateConfigAction extends AmiAction {

    private static final String ACTION = "UpdateConfig";

    public UpdateConfigAction(String srcFileName, String destFileName, String reload) {
        super(ACTION);
        addParams("SrcFilename", srcFileName);
        addParams("DstFilename", destFileName);
        addParams("Reload", reload);
    }
}
