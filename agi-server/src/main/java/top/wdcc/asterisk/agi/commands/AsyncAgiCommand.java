package top.wdcc.asterisk.agi.commands;

public class AsyncAgiCommand extends AbstractCommand {
    private static final String COMMAND = "ASYNCAGI BREAK";

    public AsyncAgiCommand() {
        super(COMMAND);
    }
}
