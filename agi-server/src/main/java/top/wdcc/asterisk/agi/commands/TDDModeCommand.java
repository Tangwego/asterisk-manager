package top.wdcc.asterisk.agi.commands;

public class TDDModeCommand extends AbstractCommand {

    private static final String COMMAND = "TDD MODE";

    public TDDModeCommand(boolean on) {
        super(COMMAND);
        addArgument(on?"on":"false");
    }
}
