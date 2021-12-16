package top.wdcc.asterisk.agi.commands;

import top.wdcc.asterisk.agi.AgiDefaultValue;

public class SetPriorityCommand extends AbstractSetCommand {

    private static final String TYPE = "PRIORITY";

    public SetPriorityCommand(){
        this(AgiDefaultValue.DEFAULT_PRIORITY);
    }

    public SetPriorityCommand(int priority) {
        super(TYPE);
        addArgument(String.valueOf(priority));
    }
}
