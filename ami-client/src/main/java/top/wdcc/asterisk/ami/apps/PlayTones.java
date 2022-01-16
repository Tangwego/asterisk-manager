package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_PlayTones">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_PlayTones
 * </a>
 * @author wavin
 */
public class PlayTones extends AbstractApplication {
    private static final String APPLICATION_NAME = "PlayTones";

    public PlayTones(String arg) {
        super(APPLICATION_NAME);
        addOptions(arg);
    }
}
