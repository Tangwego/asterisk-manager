package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_set+extension">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_receive+texthttps://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_set+extension
 *     </a>
 * @author wavin
 */
public class SetExtensionCommand extends AbstractSetCommand {
    private static final String TYPE = "EXTENSION";

    public SetExtensionCommand(String extension) {
        super(TYPE);
        addArgument(extension);
    }
}
