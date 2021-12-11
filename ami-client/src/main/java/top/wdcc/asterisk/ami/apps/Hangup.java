package top.wdcc.asterisk.ami.apps;

public class Hangup extends AbstractApplication {
    private static final String APPLICATION_NAME = "Hangup";

    private String cause;

    public Hangup() {
        this(null);
    }

    public Hangup(String cause) {
        this.cause = cause;
    }

    @Override
    public String getName() {
        return APPLICATION_NAME;
    }

    @Override
    public String getData() {
        return cause;
    }
}
