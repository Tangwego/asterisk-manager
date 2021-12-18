package top.wdcc.asterisk.agi.commands;

import top.wdcc.asterisk.agi.AgiDefaultValue;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_stream+file">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_stream+file
 *     </a>
 * @author wavin
 */
public class StreamFileCommand extends AbstractCommand {
    private static final String COMMAND = "STREAM FILE";


    public StreamFileCommand(String fileName) {
        this(fileName, AgiDefaultValue.DEFAULT_ESCAPE_DIGITS, AgiDefaultValue.DEFAULT_SAMPLE_OFFSET);
    }

    public StreamFileCommand(String fileName, String escapeDigits) {
        this(fileName, escapeDigits, AgiDefaultValue.DEFAULT_SAMPLE_OFFSET);
    }

    public StreamFileCommand(String fileName, String escapeDigits, int offset) {
        super(COMMAND);
        addArgument(fileName, escapeDigits, String.valueOf(offset));
    }

}
