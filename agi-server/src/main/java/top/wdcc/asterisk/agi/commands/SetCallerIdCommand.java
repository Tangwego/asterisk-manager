package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_set+callerid">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_set+callerid
 *     </a>
 * @author wavin
 */
public class SetCallerIdCommand extends AbstractSetCommand {

    private static final String TYPE = "CALLERID";

    public SetCallerIdCommand(String number) {
        super(TYPE);
        addArgument(number);
    }
}
