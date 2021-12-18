package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_set+music">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_set+music
 *     </a>
 * @author wavin
 */
public class SetMusicCommand extends AbstractSetCommand {

    private static final String TYPE = "MUSIC";

    public SetMusicCommand(boolean on, String clas) {
        super(TYPE);
        addArgument(on?"on":"off", clas);
    }
}
