package top.wdcc.asterisk.agi.commands;

import top.wdcc.asterisk.agi.AgiDefaultValue;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_set+autohangup">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_set+autohangup
 *     </a>
 * @author wavin
 */
public class SetAutoHangupCommand extends AbstractSetCommand {
    private static final String TYPE = "AUTOHANGUP";

    public SetAutoHangupCommand(){
        this(AgiDefaultValue.DEFAULT_TIMEOUT);
    }

    public SetAutoHangupCommand(long time) {
        super(TYPE);
        addArgument(String.valueOf(time));
    }
}
