package top.wdcc.asterisk.agi.commands;

import top.wdcc.asterisk.agi.AgiDefaultValue;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_gosub">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_gosub
 *     </a>
 * @author wavin
 */
public class GosubCommand extends AbstractCommand {

    private static final String COMMAND = "GOSUB";

    public GosubCommand(String extension) {
        this(AgiDefaultValue.DEFAULT_CONTEXT, extension, AgiDefaultValue.DEFAULT_PRIORITY);
    }

    public GosubCommand(String context, String extension, int priority, String ... optionalArgs) {
        super(COMMAND);
        addArgument(context, extension, String.valueOf(priority));
        addArgument(optionalArgs);
    }
}
