package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_Exec">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_Exec
 * </a>
 * @author wavin
 */
public class Exec extends AbstractApplication {
    private static final String APPLICATION_NAME = "Exec";

    public Exec(String conf) {
        super(APPLICATION_NAME);
        addOptions(conf);
    }
}
