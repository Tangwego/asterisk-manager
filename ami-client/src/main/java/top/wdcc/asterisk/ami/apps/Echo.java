package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_Echo">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_Echo
 * </a>
 * @author wavin
 */
public class Echo extends AbstractApplication {

    private static final String APPLICATION_NAME = "Echo";

    public Echo() {
        super(APPLICATION_NAME);
    }

}
