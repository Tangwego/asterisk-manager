package top.wdcc.asterisk.agi.commands;

public class SetMusicCommand extends AbstractSetCommand {

    private static final String TYPE = "MUSIC";

    public SetMusicCommand(boolean on, String clas) {
        super(TYPE);
        addArgument(on?"on":"off", clas);
    }
}
