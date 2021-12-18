package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications
 * </a>
 * @author wavin
 */
public class Busy extends AbstractApplication {
    private static final String APPLICATION_NAME = "Busy";

    public Busy(long timeout) {
        super(APPLICATION_NAME);
        addOptions(String.valueOf(timeout));
    }
}
