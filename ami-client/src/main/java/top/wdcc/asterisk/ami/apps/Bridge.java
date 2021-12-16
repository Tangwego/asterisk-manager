package top.wdcc.asterisk.ami.apps;

public class Bridge extends AbstractApplication {
    private static final String APPLICATION_NAME = "Bridge";

    public Bridge(String channel, String ... options) {
        super(APPLICATION_NAME);
        addOptions(options);
    }
}
