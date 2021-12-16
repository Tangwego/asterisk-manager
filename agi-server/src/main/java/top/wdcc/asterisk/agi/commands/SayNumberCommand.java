package top.wdcc.asterisk.agi.commands;

import top.wdcc.asterisk.agi.AgiDefaultValue;

public class SayNumberCommand extends AbstractSayCommand {

    private static final String TYPE = "NUMBER";

    public SayNumberCommand(int number) {
        this(number, AgiDefaultValue.DEFAULT_ESCAPE_DIGITS, AgiDefaultValue.DEFAULT_GENDER);
    }

    public SayNumberCommand(int number, String escapeDigits, String gender) {
        super(TYPE);
        addArgument(String.valueOf(number), escapeDigits, gender);
    }
}
