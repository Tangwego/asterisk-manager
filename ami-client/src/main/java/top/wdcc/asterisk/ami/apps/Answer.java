package top.wdcc.asterisk.ami.apps;

public class Answer extends AbstractApplication {

    private static final String APPLICATION_NAME = "Answer";

    public Answer(long delay, boolean nocdr){
        super(APPLICATION_NAME);
        addOptions(String.valueOf(delay));
    }
}
