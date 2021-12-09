package top.wdcc.asterisk.agi.cmds;

public class HangupCommand extends AbstractCommand {
    public static final String COMMAND = "HANGUP";
    public HangupCommand() {
        super(COMMAND);
    }
}
