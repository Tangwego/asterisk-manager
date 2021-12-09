package top.wdcc.asterisk.agi.commands;

public class StreamFileCommand extends AbstractCommand {
    public static final String COMMAND = "STREAM FILE";


    public StreamFileCommand(String fileName) {
        super(COMMAND);
        addArgument(fileName);
    }

}
