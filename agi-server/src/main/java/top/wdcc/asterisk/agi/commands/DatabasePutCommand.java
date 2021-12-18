package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_database+put">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_database+put
 *     </a>
 * @author wavin
 */
public class DatabasePutCommand extends AbstractDatabaseCommand {
    private static final String TYPE = "PUT";

    public DatabasePutCommand(String family, String key, String value) {
        super(TYPE);
        addArgument(family, key, value);
    }
}
