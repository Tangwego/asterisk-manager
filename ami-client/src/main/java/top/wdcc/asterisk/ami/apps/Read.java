package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_Read">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_Read
 * </a>
 * @author wavin
 */
public class Read extends AbstractApplication {
    private static final String APPLICATION_NAME = "Read";

    public Read(String variable, String[] fileNames, int maxdigits,
                String[] options, int attempts, long timeout) {
        super(APPLICATION_NAME);
        addOptions(variable);
        addOptions(fileNames);
        addOptions(String.valueOf(maxdigits));
        addOptions(options);
        addOptions(String.valueOf(attempts));
        addOptions(String.valueOf(timeout));
    }
}
