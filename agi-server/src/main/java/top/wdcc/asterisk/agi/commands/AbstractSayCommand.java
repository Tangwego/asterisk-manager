package top.wdcc.asterisk.agi.commands;

public class AbstractSayCommand extends AbstractCommand {

    private static final String COMMAND = "SAY";

    protected static final String DEFAULT_ESCAPE_DIGITS = "01234567890*#";

    public AbstractSayCommand(String type) {
        super(String.format("%s %s", COMMAND, type));
    }
}
