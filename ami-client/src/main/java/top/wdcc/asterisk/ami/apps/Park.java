package top.wdcc.asterisk.ami.apps;

public class Park extends AbstractApplication {
    private static final String APPLICATION_NAME = "Park";

    public Park(long timeout, String context,  int priority, String ... options){

    }

    @Override
    public String getName() {
        return APPLICATION_NAME;
    }

    @Override
    public String getData() {
        return null;
    }
}
