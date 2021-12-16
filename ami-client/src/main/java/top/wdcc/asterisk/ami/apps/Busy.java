package top.wdcc.asterisk.ami.apps;

public class Busy extends AbstractApplication {
    private static final String APPLICATION_NAME = "Busy";

    public Busy(long timeout) {
        super(APPLICATION_NAME);
        addOptions(String.valueOf(timeout));
    }
}
