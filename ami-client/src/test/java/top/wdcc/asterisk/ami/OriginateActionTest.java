package top.wdcc.asterisk.ami;

import top.wdcc.asterisk.ami.actions.OriginateAction;
import top.wdcc.asterisk.ami.apps.Playback;

public class OriginateActionTest {
    public static void main(String[] args) throws InterruptedException {
        AmiConfig amiConfig = new AmiConfig();
        amiConfig.setUsername("asterisk");
        amiConfig.setSecret("asterisk");
        amiConfig.setHost("192.168.2.100");
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
        OriginateAction action = new OriginateAction("1002");
        action.application(new Playback("demo-abouttotry"));
//        action.application(new Playback("demo-nogo"));
//        action.application(new Dial("1002"));
//        action.application(new Agi("agi://192.168.122.202:8088/TestAgiScript", "path=ooaoooa"));
        System.out.println(action);
        AmiMessage amiMessage = amiClient.sendAction(action);
        System.out.println(amiMessage);
    }
}
