package top.wdcc.asterisk.agi.commands;

import top.wdcc.asterisk.agi.AgiDefaultValue;

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
