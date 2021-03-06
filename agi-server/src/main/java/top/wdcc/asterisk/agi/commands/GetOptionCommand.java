package top.wdcc.asterisk.agi.commands;

import top.wdcc.asterisk.agi.AgiDefaultValue;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_get+option">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_get+option
 *     </a>
 * @author wavin
 */
public class GetOptionCommand extends AbstractGetCommand {
    private static final String TYPE = "OPTION";


    public GetOptionCommand(String fileName){
        this(fileName, AgiDefaultValue.DEFAULT_ESCAPE_DIGITS, AgiDefaultValue.DEFAULT_TIMEOUT);
    }

    public GetOptionCommand(String fileName, String escapeDigits, long timeout) {
        super(TYPE);
        addArgument(fileName, escapeDigits, String.valueOf(timeout));
    }
}
