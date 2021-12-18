package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_set+context">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_set+context
 *     </a>
 * @author wavin
 */
public class SetContextCommand extends AbstractSetCommand {
    private static final String TYPE = "CONTEXT";

    public SetContextCommand(String context) {
        super(TYPE);
    }
}
