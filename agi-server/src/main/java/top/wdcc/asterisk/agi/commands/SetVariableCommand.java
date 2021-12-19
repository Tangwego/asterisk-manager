package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_set+variable">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_set+variable
 *     </a>
 * @author wavin
 */
public class SetVariableCommand extends AbstractSetCommand {
    private static final String TYPE = "VARIABLE";

    public SetVariableCommand(String key, Object value) {
        super(TYPE);
        addArgument(key, String.valueOf(value));
    }
}
