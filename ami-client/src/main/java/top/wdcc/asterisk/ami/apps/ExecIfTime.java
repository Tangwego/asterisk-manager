package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_ExecIfTime">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_ExecIfTime
 * </a>
 * @author wavin
 */
public class ExecIfTime extends AbstractApplication {
    private static final String APPLICATION_NAME = "ExecIfTime";

    public ExecIfTime(String times, String weekdays,
                      String mdays, String months,
                      String timezone, Application application) {
        super(APPLICATION_NAME);
        addOptions(times, weekdays, mdays, months, timezone);
        addOptions(String.format("%s(%s)",
                application.getName(),application.getData()));
    }
}
