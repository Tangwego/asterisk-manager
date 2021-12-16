package top.wdcc.asterisk.agi.commands;

public class AbstractReceiveCommand extends AbstractCommand {
    private static final String COMMAND = "RECEIVE";

    public AbstractReceiveCommand(String type) {
        super(String.format("%s %s", COMMAND, type));
    }
}
