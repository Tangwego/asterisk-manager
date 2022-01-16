package top.wdcc.asterisk.ami.apps;

import top.wdcc.asterisk.ami.AmiDefaultValue;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_MusicOnHold">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_MusicOnHold
 * </a>
 * @author wavin
 */
public class MusicOnHold extends AbstractApplication {
    private static final String APPLICATION_NAME = "MusicOnHold";

    public MusicOnHold(String cls){
        this(cls, AmiDefaultValue.DEFAULT_DURATION);
    }

    public MusicOnHold(String cls, long duration) {
        super(APPLICATION_NAME);
        addOptions(cls, String.valueOf(duration));
    }
}
