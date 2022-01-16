package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_Set">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_Set
 * </a>
 * @author wavin
 */
public class Set extends AbstractApplication {
    private static final String APPLICATION_NAME = "Set";

    public Set(String key, String value) {
        super(APPLICATION_NAME);
        addOptions(String.format("%s=%s", key, value));
    }

}
