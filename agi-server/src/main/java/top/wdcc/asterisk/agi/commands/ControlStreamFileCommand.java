package top.wdcc.asterisk.agi.commands;

public class ControlStreamFileCommand extends AbstractCommand {
    private static final String COMMAND = "CONTROL STREAM FILE";

    public ControlStreamFileCommand(String fileName, String escapeDigits, long skipms, String ffChar, String rewChr, String pauseChr) {
        super(COMMAND);
        addArgument(fileName, escapeDigits, String.valueOf(skipms), ffChar, rewChr, pauseChr);
    }
}
