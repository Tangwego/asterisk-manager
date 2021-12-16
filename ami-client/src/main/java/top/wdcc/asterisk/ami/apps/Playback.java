package top.wdcc.asterisk.ami.apps;

/**
 * playback app
 */
public class Playback extends AbstractApplication {

    private static final String APPLICATION_NAME = "Playback";

    public Playback(String fileName, String ... options) {
        super(APPLICATION_NAME);
        addOptions(fileName);
        addOptions(options);
    }

}
