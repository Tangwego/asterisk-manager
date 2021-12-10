package top.wdcc.asterisk.agi.commands;

public class SayNumberCommand extends AbstractSayCommand {

    private static final String TYPE = "NUMBER";

    private static final String DEFAULT_GENDER = "female";

    public SayNumberCommand(int number) {
        this(number, DEFAULT_ESCAPE_DIGITS, DEFAULT_GENDER);
    }

    public SayNumberCommand(int number, String escapeDigits, String gender) {
        super(TYPE);
        addArgument(String.valueOf(number), escapeDigits, gender);
    }
}
