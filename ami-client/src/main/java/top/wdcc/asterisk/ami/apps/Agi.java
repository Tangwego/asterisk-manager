package top.wdcc.asterisk.ami.apps;

public class Agi extends AbstractApplication {
    private static final String APPLICATION_NAME = "AGI";

    public Agi(String url, String ... arguments){
        addOptions(url);
        addOptions(arguments);
    }

    @Override
    public String getName() {
        return APPLICATION_NAME;
    }
}
