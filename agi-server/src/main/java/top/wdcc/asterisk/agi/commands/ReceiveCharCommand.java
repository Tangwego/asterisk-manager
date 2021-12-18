package top.wdcc.asterisk.agi.commands;

import top.wdcc.asterisk.agi.AgiDefaultValue;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_receive+char">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_receive+char
 *     </a>
 * @author wavin
 */
public class ReceiveCharCommand extends AbstractReceiveCommand {

    private static final String TYPE = "CHAR";

    public ReceiveCharCommand() {
        this(AgiDefaultValue.DEFAULT_TIMEOUT);
    }

    public ReceiveCharCommand(long timeout) {
        super(TYPE);
        addArgument(String.valueOf(timeout));
    }
}
