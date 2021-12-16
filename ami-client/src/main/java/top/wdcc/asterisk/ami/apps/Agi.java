package top.wdcc.asterisk.ami.apps;

public class Agi extends AbstractApplication {
    private static final String APPLICATION_NAME = "AGI";

    public Agi(String url, String ... arguments){
        super(APPLICATION_NAME);
        addOptions(url);
        addOptions(arguments);
    }

}
