package top.wdcc.asterisk.ami;

import top.wdcc.asterisk.ami.actions.QueuesAction;

/**
 * @author wavin
 * @date 2021/12/26
 */
public class QueuesActionTest {
    public static void main(String[] args) throws InterruptedException {
        AmiConfig amiConfig = new AmiConfig();
        amiConfig.setUsername("asterisk");
        amiConfig.setSecret("asterisk");
        amiConfig.setHost("192.168.0.200");
        amiConfig.setPort(5038);
        AmiClient amiClient = new AmiClient(amiConfig);
        amiClient.setEventListener(new AmiEventListener() {
            @Override
            public void onLogin(boolean success) {
                // TODO login success
            }

            @Override
            public void onEvent(AmiEvent event) {
                // TODO received event
            }
        });

        amiClient.login();
        AmiMessage amiMessage = amiClient.sendAction(new QueuesAction());
        System.out.println(amiMessage.toString());

        amiClient.close();
    }
}
