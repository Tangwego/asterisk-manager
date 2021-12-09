package top.wdcc.asterisk.agi.commands;

public class HangupCommand extends AbstractCommand {
    public static final String COMMAND = "HANGUP";
    public HangupCommand() {
        super(COMMAND);
    }
}
