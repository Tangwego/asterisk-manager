package top.wdcc.asterisk.agi.commands;

public class SayDigitsCommand extends AbstractSayCommand {

    private static final String TYPE = "DIGITS";

    public SayDigitsCommand(String digits) {
        this(digits, DEFAULT_ESCAPE_DIGITS);
    }

    public SayDigitsCommand(String digits, String escapeDigits) {
        super(TYPE);
        addArgument(digits, escapeDigits);
    }
}
