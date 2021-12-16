package top.wdcc.asterisk.agi.commands;

import top.wdcc.asterisk.agi.AgiDefaultValue;

public class WaitForDigitCommand extends AbstractCommand {

    private static final String COMMAND = "WAIT FOR";

    public WaitForDigitCommand(String digit) {
        this(digit, AgiDefaultValue.DEFAULT_TIMEOUT);
    }

    public WaitForDigitCommand(String digit, long timeout) {
        super(COMMAND);
        addArgument(digit, String.valueOf(timeout));
    }

}
