package top.wdcc.asterisk.agi.commands;

import top.wdcc.asterisk.agi.AgiDefaultValue;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_say+phonetic">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_say+phonetic
 *     </a>
 * @author wavin
 */
public class SayPhoneticCommand extends AbstractSayCommand {

    private static final String TYPE = "PHONETIC";

    public SayPhoneticCommand(String phoneNumber) {
        this(phoneNumber, AgiDefaultValue.DEFAULT_ESCAPE_DIGITS);
    }

    public SayPhoneticCommand(String phoneNumber, String escapeDigits) {
        super(TYPE);
        addArgument(phoneNumber, escapeDigits);
    }
}
