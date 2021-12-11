package top.wdcc.asterisk.ami.apps;

/**
 * playback app
 */
public class Playback extends AbstractApplication {

    private static final String APPLICATION_NAME = "Playback";


    public Playback(String fileName, String ... options) {
        addOptions(fileName);
        addOptions(options);
    }

    @Override
    public String getName() {
        return APPLICATION_NAME;
    }

}
