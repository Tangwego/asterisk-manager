package top.wdcc.asterisk.agi.commands;

public class SetCallerIdCommand extends AbstractSetCommand {

    private static final String TYPE = "CALLERID";

    public SetCallerIdCommand(String number) {
        super(TYPE);
        addArgument(number);
    }
}
