package top.wdcc.asterisk.agi.commands;

public class AbstractSetCommand extends AbstractCommand {
    private static final String COMMAND = "SET";

    public AbstractSetCommand(String type) {
        super(String.format("%s %s", COMMAND, type));
    }
}
