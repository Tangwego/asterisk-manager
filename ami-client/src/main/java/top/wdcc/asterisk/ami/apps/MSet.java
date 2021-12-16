package top.wdcc.asterisk.ami.apps;

public class MSet extends AbstractApplication {
    private static final String APPLICATION_NAME = "MSet";

    public MSet() {
        this(null);
    }

    public MSet(String ... kv) {
        super(APPLICATION_NAME);
        addOptions(kv);
    }

    public void set(String key, String value) {
        addOptions(String.format("%s=%s", key, value));
    }
}
