package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_database+deltree">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_database+deltree
 *     </a>
 * @author wavin
 */
public class DatabaseDeltreeCommand extends AbstractDatabaseCommand {
    private static final String TYPE = "DELTREE";

    public DatabaseDeltreeCommand(String family, String keytree) {
        super(TYPE);
        addArgument(family, keytree);
    }
}
