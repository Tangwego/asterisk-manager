package top.wdcc.asterisk.agi.commands;

import top.wdcc.asterisk.ami.apps.Application;

public class ExecCommand extends AbstractCommand {

    private static final String COMMAND = "EXEC";

    public ExecCommand(Application app) {
        super(COMMAND);
        addArgument(app.getName(), app.getData());
    }
}
