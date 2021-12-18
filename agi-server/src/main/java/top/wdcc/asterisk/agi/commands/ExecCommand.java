package top.wdcc.asterisk.agi.commands;

import top.wdcc.asterisk.ami.apps.Application;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_exec">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_exec
 *     </a>
 * @author wavin
 */
public class ExecCommand extends AbstractCommand {

    private static final String COMMAND = "EXEC";

    public ExecCommand(Application app) {
        super(COMMAND);
        addArgument(app.getName(), app.getData());
    }
}
