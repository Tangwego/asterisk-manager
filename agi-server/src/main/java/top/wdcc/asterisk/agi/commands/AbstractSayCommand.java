package top.wdcc.asterisk.agi.commands;

public class AbstractSayCommand extends AbstractCommand {

    private static final String COMMAND = "SAY";

    public AbstractSayCommand(String type) {
        super(String.format("%s %s", COMMAND, type));
    }
}
