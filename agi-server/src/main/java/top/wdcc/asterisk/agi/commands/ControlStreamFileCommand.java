package top.wdcc.asterisk.agi.commands;

public class ControlStreamFileCommand extends AbstractCommand {
    private static final String COMMAND = "CONTROL STREAM FILE";

    private static final String DEFAULT_ESCAPE_DIGITS = "01234567890*#";
    private static final int DEFAULT_SAMPLE_OFFSET = 0;

    public ControlStreamFileCommand(String fileName, String escapeDigits, long skipms, String ffChar, String rewChr, String pauseChr) {
        super(COMMAND);
        addArgument(fileName, escapeDigits, String.valueOf(skipms), ffChar, rewChr, pauseChr);
    }
}
