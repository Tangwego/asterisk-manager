package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_CreateConfig">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_CreateConfig
 * </a>
 * @author wavin
 */
public class CreateConfigAction extends AmiAction {

    private static final String ACTION = "CreateConfig";

    public CreateConfigAction(String fileName) {
        super(ACTION);
        addParams("FileName", fileName);
    }
}
