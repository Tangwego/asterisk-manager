package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_Record">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_Record
 * </a>
 * @author wavin
 */
public class Record extends AbstractApplication {
    private static final String APPLICATION_NAME = "Record";

    public Record(String fileName){
        this(fileName, 0, 0, null);
    }

    public Record(String fileName, int silence, int maxduration, String ... options) {
        super(APPLICATION_NAME);
        addOptions(fileName);
        addOptions(String.valueOf(silence));
        addOptions(String.valueOf(maxduration));
        addOptions(options);
    }
}
