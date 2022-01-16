package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_PickupChan">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_PickupChan
 * </a>
 * @author wavin
 */
public class PickupChan extends AbstractApplication {
    private static final String APPLICATION_NAME = "PickupChan";

    public PickupChan(String channel, String ... options) {
        super(APPLICATION_NAME);
        addOptions(channel);
        addOptions(options);
    }
}
