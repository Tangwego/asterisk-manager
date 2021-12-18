package top.wdcc.asterisk.agi.commands;

import top.wdcc.asterisk.agi.AgiDefaultValue;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_say+alpha">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_say+alpha
 *     </a>
 * @author wavin
 */
public class SayAlphaCommand extends AbstractSayCommand {
    private static final String TYPE = "ALPHA";

    public SayAlphaCommand(String alpha) {
        super(TYPE);
        addArgument(alpha,  AgiDefaultValue.DEFAULT_ESCAPE_DIGITS);
    }

    public SayAlphaCommand(String alpha, String escapeDigits) {
        super(TYPE);
        addArgument(alpha,  escapeDigits);
    }
}
