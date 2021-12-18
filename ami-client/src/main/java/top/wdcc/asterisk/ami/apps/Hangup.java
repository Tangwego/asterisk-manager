package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications
 * </a>
 * @author wavin
 */
public class Hangup extends AbstractApplication {
    private static final String APPLICATION_NAME = "Hangup";

    private String cause;

    public Hangup() {
        this(null);
    }

    public Hangup(String cause) {
        super(APPLICATION_NAME);
        this.cause = cause;
    }

    @Override
    public String getData() {
        return cause;
    }
}
