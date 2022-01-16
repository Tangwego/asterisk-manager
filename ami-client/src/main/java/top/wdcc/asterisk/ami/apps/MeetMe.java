package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_MeetMe">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_MeetMe
 * </a>
 * @author wavin
 */
public class MeetMe extends AbstractApplication {
    private static final String APPLICATION_NAME = "MeetMe";

    public MeetMe(String confNo, String ... options) {
        super(APPLICATION_NAME);
        addOptions(confNo);
        addOptions(options);
    }
}
