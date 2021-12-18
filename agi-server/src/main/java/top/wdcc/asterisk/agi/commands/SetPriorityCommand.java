package top.wdcc.asterisk.agi.commands;

import top.wdcc.asterisk.agi.AgiDefaultValue;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_set+priority">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_set+priority
 *     </a>
 * @author wavin
 */
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
