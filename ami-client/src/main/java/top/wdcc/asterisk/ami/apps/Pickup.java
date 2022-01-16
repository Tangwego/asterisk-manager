package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_Pickup">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_Pickup
 * </a>
 * @author wavin
 */
public class Pickup extends AbstractApplication {
    private static final String APPLICATION_NAME = "Pickup";

    public Pickup(String ... targets) {
        super(APPLICATION_NAME);
        addOptions(targets);
    }
}
