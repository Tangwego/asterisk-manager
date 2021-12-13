package top.wdcc.asterisk.agi.commands;

public class WaitForDigitCommand extends AbstractCommand {

    private static final String COMMAND = "WAIT FOR";

    private static final long DEFAULT_TIMEOUT = 30000;

    public WaitForDigitCommand(String digit) {
        this(digit, DEFAULT_TIMEOUT);
    }

    public WaitForDigitCommand(String digit, long timeout) {
        super(COMMAND);
        addArgument(digit, String.valueOf(timeout));
    }

}
