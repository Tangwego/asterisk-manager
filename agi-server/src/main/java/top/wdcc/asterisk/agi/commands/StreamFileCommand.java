package top.wdcc.asterisk.agi.commands;

public class StreamFileCommand extends AbstractCommand {
    public static final String COMMAND = "STREAM FILE";

    public static final String DEFAULT_DIGITS = "01234567890*#";
    public static final int DEFAULT_SAMPLE_OFFSET = 0;
    public StreamFileCommand(String fileName) {
        this(fileName, DEFAULT_DIGITS, DEFAULT_SAMPLE_OFFSET);
    }

    public StreamFileCommand(String fileName, String digits) {
        this(fileName, digits, DEFAULT_SAMPLE_OFFSET);
    }

    public StreamFileCommand(String fileName, String digits, int offset) {
        super(COMMAND);
        addArgument(fileName, digits, String.valueOf(offset));
    }

}
