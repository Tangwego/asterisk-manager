package top.wdcc.asterisk.agi.commands;

import top.wdcc.asterisk.agi.AgiDefaultValue;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_receive+text">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_receive+text
 *     </a>
 * @author wavin
 */
public class ReceiveTextCommand extends AbstractReceiveCommand {

    private static final String TYPE = "TEXT";

    public ReceiveTextCommand() {
        this(AgiDefaultValue.DEFAULT_TIMEOUT);
    }

    public ReceiveTextCommand(long timeout) {
        super(TYPE);
        addArgument(String.valueOf(timeout));
    }
}
