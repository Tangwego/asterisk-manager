package top.wdcc.asterisk.agi.commands;

public class RecordFileCommand extends AbstractCommand {

    private static final String COMMAND = "RECORD FILE";

    private static final String DEFAULT_ESCAPE_DIGITS = "01234567890*#";
    private static final int DEFAULT_OFFSET = 0;
    private static final long DEFAULT_SAMPLES = 8000l;
    private static final long DEFAULT_TIMEOUT = 30;

    public RecordFileCommand(String fileName, String format){
        this(fileName, format, DEFAULT_ESCAPE_DIGITS, DEFAULT_TIMEOUT, DEFAULT_OFFSET, DEFAULT_SAMPLES, false, false);
    }

    public RecordFileCommand(String fileName, String format, String escapeDigits, long timeout, int offset, long samples, boolean beep, boolean silence) {
        super(COMMAND);
        addArgument(fileName, format, escapeDigits, String.valueOf(timeout), String.valueOf(offset), String.valueOf(samples), beep?"BEEP":"", silence?"S=SILENCE":"");
    }
}
