package top.wdcc.asterisk.agi.commands;

public class SayAlphaCommand extends AbstractSayCommand {
    private static final String TYPE = "ALPHA";

    public SayAlphaCommand(String alpha) {
        super(TYPE);
        addArgument(alpha,  DEFAULT_ESCAPE_DIGITS);
    }

    public SayAlphaCommand(String alpha, String escapeDigits) {
        super(TYPE);
        addArgument(alpha,  escapeDigits);
    }
}
