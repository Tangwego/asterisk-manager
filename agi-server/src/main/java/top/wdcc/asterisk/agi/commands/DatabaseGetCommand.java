package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_database+get">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_database+get
 *     </a>
 * @author wavin
 */
public class DatabaseGetCommand extends AbstractDatabaseCommand {
    private static final String TYPE = "GET";

    public DatabaseGetCommand(String family, String key) {
        super(TYPE);
        addArgument(family, key);
    }
}
