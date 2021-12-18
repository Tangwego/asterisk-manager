package top.wdcc.asterisk.agi.commands;

/**
 * this is a kind of say command implementation for {@code AgiCommand}
 * @see top.wdcc.asterisk.agi.commands.AbstractCommand
 * @see top.wdcc.asterisk.agi.commands.AgiCommand
 * @author wavin
 */
public class AbstractSayCommand extends AbstractCommand {

    private static final String COMMAND = "SAY";

    public AbstractSayCommand(String type) {
        super(String.format("%s %s", COMMAND, type));
    }
}
