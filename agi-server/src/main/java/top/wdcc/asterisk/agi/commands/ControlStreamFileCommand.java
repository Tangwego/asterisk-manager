package top.wdcc.asterisk.agi.commands;

/**
 * @see <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_control+stream+file">
 *     https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+AGICommand_control+stream+file
 *     </a>
 * @author wavin
 */
public class ControlStreamFileCommand extends AbstractCommand {
    private static final String COMMAND = "CONTROL STREAM FILE";

    public ControlStreamFileCommand(String fileName, String escapeDigits, long skipms, String ffChar, String rewChr, String pauseChr) {
        super(COMMAND);
        addArgument(fileName, escapeDigits, String.valueOf(skipms), ffChar, rewChr, pauseChr);
    }
}
