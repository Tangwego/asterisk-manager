package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_get+full+variable">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_get+full+variable
 *     </a>
 * @author wavin
 */
public class GetFullVariableCommand extends AbstractGetCommand {

    private static final String TYPE = "FULL VARIABLE";

    public GetFullVariableCommand(String name, String channelName) {
        super(TYPE);
        addArgument(name, channelName);
    }
}
