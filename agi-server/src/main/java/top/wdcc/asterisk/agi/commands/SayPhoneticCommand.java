package top.wdcc.asterisk.agi.commands;

public class SayPhoneticCommand extends AbstractSayCommand {

    private static final String TYPE = "PHONETIC";

    public SayPhoneticCommand(String phoneNumber) {
        this(phoneNumber, DEFAULT_ESCAPE_DIGITS);
    }

    public SayPhoneticCommand(String phoneNumber, String escapeDigits) {
        super(TYPE);
        addArgument(phoneNumber, escapeDigits);
    }
}
