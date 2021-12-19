package top.wdcc.asterisk.ami.actions;

/**
 * a basic ami action no fields just a name.
 *
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AMI+Actions">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AMI+Actions
 *     </a>
 * @author wavin
 */
public class BasicAction extends AmiAction {
    public BasicAction(String name) {
        super(name);
    }
}
