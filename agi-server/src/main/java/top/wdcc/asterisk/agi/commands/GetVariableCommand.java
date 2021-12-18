package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_get+variable">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_get+variable
 *     </a>
 * @author wavin
 */
public class GetVariableCommand extends AbstractGetCommand {
    private static final String TYPE = "VARIABLE";

    public GetVariableCommand(String key) {
        super(TYPE);
        addArgument(key);
    }
}
