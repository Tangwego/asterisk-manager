package top.wdcc.asterisk.ami.apps;

public class AddQueueMember extends AbstractApplication {
    private static final String APPLICATION_NAME = "AddQueueMember";

    public AddQueueMember(String queueName, String interfaceName, String penalty, String options, String memberName, String stateInterfaceName) {
        super(APPLICATION_NAME);
        addOptions(queueName, interfaceName, penalty, options, memberName, stateInterfaceName);
    }
}
