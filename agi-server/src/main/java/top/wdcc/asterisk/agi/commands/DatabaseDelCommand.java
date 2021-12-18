package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_database+del">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_database+del
 *     </a>
 * @author wavin
 */
public class DatabaseDelCommand extends AbstractDatabaseCommand {
    private static final String TYPE = "DEL";

    public DatabaseDelCommand(String family, String key) {
        super(TYPE);
        addArgument(family, key);
    }
}
