package top.wdcc.asterisk.agi.commands;

public class AbstractGetCommand extends AbstractCommand {
    private static final String COMMAND = "GET";

    public AbstractGetCommand(String type) {
        super(String.format("%s %s", COMMAND, type));
    }
}
