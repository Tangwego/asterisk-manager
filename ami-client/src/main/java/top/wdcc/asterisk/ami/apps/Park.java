package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications
 * </a>
 * @author wavin
 */
public class Park extends AbstractApplication {
    private static final String APPLICATION_NAME = "Park";

    public Park(long timeout, String context,  int priority, String ... options){
        super(APPLICATION_NAME);
    }
}
