package top.wdcc.asterisk.agi.commands;

public class GetDataCommand extends AbstractGetCommand {

    private static final String TYPE = "DATA";

    public GetDataCommand(String file, long timeout, String maxDigits) {
        super(TYPE);
        addArgument(file, String.valueOf(timeout), maxDigits);
    }
}
