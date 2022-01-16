package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_ConfBridger">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_ConfBridge
 * </a>
 * @author wavin
 */
public class ConfBridge extends AbstractApplication {

    private static final String APPLICATION_NAME = "ConfBridge";

    public ConfBridge(String conf) {
        super(APPLICATION_NAME);
        addOptions(conf);
    }
}
