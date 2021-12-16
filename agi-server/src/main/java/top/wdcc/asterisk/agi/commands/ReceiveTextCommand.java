package top.wdcc.asterisk.agi.commands;

import top.wdcc.asterisk.agi.AgiDefaultValue;

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
