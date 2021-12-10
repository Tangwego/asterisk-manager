package top.wdcc.asterisk.agi.commands;

public class GetVariableCommand extends AbstractCommand {
    private static final String COMMAND = "GET VARIABLE";

    public GetVariableCommand(String key) {
        super(COMMAND);
        addArgument(key);
    }
}
