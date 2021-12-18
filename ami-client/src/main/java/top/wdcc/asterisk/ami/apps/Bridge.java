package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications
 * </a>
 * @author wavin
 */
public class Bridge extends AbstractApplication {
    private static final String APPLICATION_NAME = "Bridge";

    public Bridge(String channel, String ... options) {
        super(APPLICATION_NAME);
        addOptions(options);
    }
}
