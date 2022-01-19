package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_ExecIf">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_ExecIf
 * </a>
 * @author wavin
 */
public class ExecIf extends AbstractApplication {
    private static final String APPLICATION_NAME = "ExecIf";

    public ExecIf(String expression, Application appiftrue,Application appiffalse) {
        super(APPLICATION_NAME);
        addOptions(expression);
        addOptions(String.format("%s(%s)",
                appiftrue.getName(),appiftrue.getData()));
        if (appiffalse != null) {
            addOptions(String.format("%s(%s)",
                    appiffalse.getName(), appiffalse.getData()));
        }
    }
}
