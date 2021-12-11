package top.wdcc.asterisk.ami;

import top.wdcc.asterisk.ami.actions.OriginateAction;
import top.wdcc.asterisk.ami.apps.Agi;
import top.wdcc.asterisk.ami.apps.Dial;

public class DialAppTest {
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
                // TODO login
                System.out.println("login success: " + success);
            }

            @Override
            public void onEvent(AmiEvent event) {
                // TODO received event
                System.out.println("recevied event: " + event.toString());
            }
        });

        amiClient.login();
        OriginateAction action = new OriginateAction("1001");
        action.application(new Dial("1002"));
        System.out.println(action);
        AmiMessage amiMessage = amiClient.sendAction(action);
        System.out.println(amiMessage);
    }
}
