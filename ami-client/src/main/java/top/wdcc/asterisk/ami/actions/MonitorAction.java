package top.wdcc.asterisk.ami.actions;

import top.wdcc.asterisk.ami.AmiDefaultValue;

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
        this(channel, channel, AmiDefaultValue.DEFAULT_RECORD_FORMAT, AmiDefaultValue.DEFAULT_MIX_CHANNELS);
    }

    public MonitorAction(String channel, String fileName) {
        this(channel, fileName, AmiDefaultValue.DEFAULT_RECORD_FORMAT, AmiDefaultValue.DEFAULT_MIX_CHANNELS);
    }

    public MonitorAction(String channel, String fileName, String format) {
        this(channel, fileName, format, AmiDefaultValue.DEFAULT_MIX_CHANNELS);
    }

    public MonitorAction(String channel, String fileName, String format, boolean mix) {
        super(ACTION);
        addParams("Channel", channel);
        addParams("File", fileName);
        addParams("Format", format);
        addParams("Mix", String.valueOf(mix));
    }
}
