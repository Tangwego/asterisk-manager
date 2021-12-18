package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications
 * </a>
 * @author wavin
 */
public class Answer extends AbstractApplication {

    private static final String APPLICATION_NAME = "Answer";

    public Answer(long delay, boolean nocdr){
        super(APPLICATION_NAME);
        addOptions(String.valueOf(delay));
    }
}
