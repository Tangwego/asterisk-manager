package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_Queue">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_Queue
 * </a>
 * @author wavin
 */
public class Queue extends AbstractApplication {
    private static final String APPLICATION_NAME = "Queue";

    public Queue(String queueName){
        this(queueName, null, null, null, 0, null, null,null,null,0);
    }

    public Queue(String queueName, String[] options, String url, String announceOverride,
                 long timeout, String agi, String macro, String gosub, String rule, int position) {
        super(APPLICATION_NAME);
        addOptions(queueName);
        addOptions(options);
        addOptions(url);
        addOptions(announceOverride);
        addOptions(String.valueOf(timeout));
        addOptions(agi);
        addOptions(macro);
        addOptions(gosub);
        addOptions(rule);
        addOptions(String.valueOf(position));
    }
}
