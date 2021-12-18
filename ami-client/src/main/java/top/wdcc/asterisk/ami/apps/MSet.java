package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications
 * </a>
 * @author wavin
 */
public class MSet extends AbstractApplication {
    private static final String APPLICATION_NAME = "MSet";

    public MSet() {
        this(null);
    }

    public MSet(String ... kv) {
        super(APPLICATION_NAME);
        addOptions(kv);
    }

    public void set(String key, String value) {
        addOptions(String.format("%s=%s", key, value));
    }
}
