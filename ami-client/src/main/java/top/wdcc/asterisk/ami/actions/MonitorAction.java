package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Monitor">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Monitor
 * </a>
 * @author wavin
 */
public class MonitorAction extends AmiAction {

    private static final String ACTION = "Monitor";

    public MonitorAction(String channel) {
        this(channel, channel, ActionDefaultValue.DEFAULT_RECORD_FORMAT, ActionDefaultValue.DEFAULT_MIX_CHANNELS);
    }

    public MonitorAction(String channel, String fileName) {
        this(channel, fileName, ActionDefaultValue.DEFAULT_RECORD_FORMAT, ActionDefaultValue.DEFAULT_MIX_CHANNELS);
    }

    public MonitorAction(String channel, String fileName, String format) {
        this(channel, fileName, format, ActionDefaultValue.DEFAULT_MIX_CHANNELS);
    }

    public MonitorAction(String channel, String fileName, String format, boolean mix) {
        super(ACTION);
        addParams("Channel", channel);
        addParams("File", fileName);
        addParams("Format", format);
        addParams("Mix", String.valueOf(mix));
    }
}
