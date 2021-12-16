package top.wdcc.asterisk.agi.commands;

public class NoopCommand extends AbstractCommand {

    private static final String COMMAND = "NOOP";

    public NoopCommand() {
        super(COMMAND);
    }
}
