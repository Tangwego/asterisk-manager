package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_get+data">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_get+data
 *     </a>
 * @author wavin
 */
public class GetDataCommand extends AbstractGetCommand {

    private static final String TYPE = "DATA";

    public GetDataCommand(String file, long timeout, String maxDigits) {
        super(TYPE);
        addArgument(file, String.valueOf(timeout), maxDigits);
    }
}
