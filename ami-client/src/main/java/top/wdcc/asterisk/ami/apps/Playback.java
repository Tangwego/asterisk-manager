package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications
 * </a>
 * @author wavin
 */
public class Playback extends AbstractApplication {

    private static final String APPLICATION_NAME = "Playback";

    public Playback(String fileName, String ... options) {
        super(APPLICATION_NAME);
        addOptions(fileName);
        addOptions(options);
    }

}
