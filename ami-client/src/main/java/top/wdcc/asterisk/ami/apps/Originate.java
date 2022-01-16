package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_Originate">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_Originate
 * </a>
 * @author wavin
 */
public class Originate extends AbstractApplication {
    private static final String APPLICATION_NAME = "Originate";

    public Originate(String channel, String type, String ... args) {
        super(APPLICATION_NAME);
        addOptions(channel, type);
        addOptions(args);
    }
}
