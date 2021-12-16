package top.wdcc.asterisk.agi.commands;

import top.wdcc.asterisk.agi.AgiDefaultValue;

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
