package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Command">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Command
 * </a>
 * @author wavin
 */
public class CommandAction extends AmiAction {
    private static final String ACTION = "Command";
    public CommandAction(String command) {
        super(ACTION);
        addParams("Command", command);
    }
}
