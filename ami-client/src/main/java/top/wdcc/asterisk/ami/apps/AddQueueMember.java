package top.wdcc.asterisk.ami.apps;

import top.wdcc.asterisk.ami.Tech;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Dialplan+Applications
 * </a>
 * @author wavin
 */
public class AddQueueMember extends AbstractApplication {
    private static final String APPLICATION_NAME = "AddQueueMember";

    public AddQueueMember(String queueName, Tech interfaceType, String penalty, String options, String memberName, String stateInterfaceName) {
        super(APPLICATION_NAME);
        addOptions(queueName, interfaceType.name(), penalty, options, memberName, stateInterfaceName);
    }
}
