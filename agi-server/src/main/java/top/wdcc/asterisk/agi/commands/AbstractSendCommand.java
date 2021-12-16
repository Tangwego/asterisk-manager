package top.wdcc.asterisk.agi.commands;

public class AbstractSendCommand extends AbstractCommand {

    private static final String COMMAND = "SEND";

    public AbstractSendCommand(String type) {
        super(String.format("%s %s", COMMAND, type));
    }
}
