package top.wdcc.asterisk.agi.commands;

public class StreamFileCommand extends AbstractCommand {
    private static final String COMMAND = "STREAM FILE";

    private static final String DEFAULT_ESCAPE_DIGITS = "01234567890*#";
    private static final int DEFAULT_SAMPLE_OFFSET = 0;

    public StreamFileCommand(String fileName) {
        this(fileName, DEFAULT_ESCAPE_DIGITS, DEFAULT_SAMPLE_OFFSET);
    }

    public StreamFileCommand(String fileName, String escapeDigits) {
        this(fileName, escapeDigits, DEFAULT_SAMPLE_OFFSET);
    }

    public StreamFileCommand(String fileName, String escapeDigits, int offset) {
        super(COMMAND);
        addArgument(fileName, escapeDigits, String.valueOf(offset));
    }

}
