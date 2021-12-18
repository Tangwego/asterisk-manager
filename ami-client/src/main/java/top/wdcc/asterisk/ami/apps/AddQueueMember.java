package top.wdcc.asterisk.ami.apps;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications
 * </a>
 * @author wavin
 */
public class AddQueueMember extends AbstractApplication {
    private static final String APPLICATION_NAME = "AddQueueMember";

    public AddQueueMember(String queueName, String interfaceName, String penalty, String options, String memberName, String stateInterfaceName) {
        super(APPLICATION_NAME);
        addOptions(queueName, interfaceName, penalty, options, memberName, stateInterfaceName);
    }
}
