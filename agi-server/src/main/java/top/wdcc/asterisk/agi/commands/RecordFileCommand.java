package top.wdcc.asterisk.agi.commands;

import top.wdcc.asterisk.agi.AgiDefaultValue;

public class RecordFileCommand extends AbstractCommand {

    private static final String COMMAND = "RECORD FILE";

    public RecordFileCommand(String fileName, String format){
        this(fileName, format,
                AgiDefaultValue.DEFAULT_ESCAPE_DIGITS,
                AgiDefaultValue.DEFAULT_TIMEOUT,
                AgiDefaultValue.DEFAULT_OFFSET,
                AgiDefaultValue.DEFAULT_SAMPLES, false, false);
    }

    public RecordFileCommand(String fileName, String format, String escapeDigits, long timeout, int offset, long samples, boolean beep, boolean silence) {
        super(COMMAND);
        addArgument(fileName, format, escapeDigits, String.valueOf(timeout), String.valueOf(offset), String.valueOf(samples), beep?"BEEP":"", silence?"S=SILENCE":"");
    }
}
