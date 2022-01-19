package top.wdcc.asterisk.ami;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_MusicOnHold">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_MusicOnHold
 * </a>
 * @author wavin
 */
public class AmiDefaultValue {

    /**
     * originate default values
     */
    public static final String DEFAULT_CALLERID = "asterisk";
    public static final String DEFAULT_CONTEXT = "default";
    public static final int DEFAULT_PRIORITY = 1;
    public static final int DEFAULT_TIMEOUT = 30000;
    public static final boolean DEFAULT_ASYNC = true;
    public static final String DEFAULT_VARIABLE = "SIPADDHEADER=Call-Info:\\; answer-after=0";

    public static final boolean DEFAULT_MIX_CHANNELS = true;
    public static final String DEFAULT_RECORD_FORMAT = "wav";

    public static final int DEFAULT_CAUSE = 486;
    public static final long DEFAULT_DURATION = 30000L;

    public static final String DEFAULT_DELIMITER = ",";
}
