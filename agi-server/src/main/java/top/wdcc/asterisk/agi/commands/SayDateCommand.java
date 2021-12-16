package top.wdcc.asterisk.agi.commands;

import org.apache.commons.lang3.StringUtils;
import top.wdcc.asterisk.agi.AgiDefaultValue;

import java.util.Date;
import java.util.TimeZone;

public class SayDateCommand extends AbstractSayCommand {
    public static final String TYPE_DATE = "DATE";

    public static final String TYPE_DATETIME = "DATETIME";

    public static final String TYPE_TIME = "TIME";

    public SayDateCommand() {
        this(new Date());
    }

    public SayDateCommand(Date date) {
        this(TYPE_DATE, date, null);
    }

    public SayDateCommand(String type, Date date) {
        this(type, date, AgiDefaultValue.DEFAULT_ESCAPE_DIGITS);
    }

    public SayDateCommand(String type, Date date, String escapeDigits) {
        this(type, date, escapeDigits, null, null);
    }

    public SayDateCommand(String type, Date date,String format, TimeZone timeZone) {
        this(type, date, AgiDefaultValue.DEFAULT_ESCAPE_DIGITS, format, timeZone);
    }

    public SayDateCommand(String type, Date date, String escapeDigits, String format, TimeZone timeZone) {
        super(type);
        if (!StringUtils.equalsIgnoreCase(type, TYPE_DATETIME)) {
            throw new IllegalStateException("Only datetime type can use this constructor!");
        }
        addArgument(String.valueOf(date.getTime()), escapeDigits, format, timeZone.getID());
    }
}
