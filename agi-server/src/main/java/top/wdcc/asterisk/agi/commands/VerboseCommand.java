package top.wdcc.asterisk.agi.commands;

public class VerboseCommand extends AbstractCommand {

    private static final String COMMAND = "VERBOSE";

    public VerboseCommand(String message, int level) {
        super(COMMAND);
        addArgument(message, String.valueOf(level));
    }
}
