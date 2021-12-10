package top.wdcc.asterisk.agi;

import top.wdcc.asterisk.ami.*;
import top.wdcc.asterisk.ami.actions.OriginateAction;
import top.wdcc.asterisk.ami.apps.Agi;

public class AgiScriptTest {

    public static void main(String[] args) throws InterruptedException {
        AgiServer server = new AgiServer(8088);
        new Thread(()->{
            server.start();
        }).start();

        do{
            Thread.sleep(3000);
            System.out.println("server is not started yet !");
        }while (!server.isStarted());

        // to run this test must start agi server first
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
        OriginateAction action = new OriginateAction("1001");
        action.application(new Agi("agi://192.168.122.202:8088/TestAgiScript", "name","password"));
        System.out.println(action);
        AmiMessage amiMessage = amiClient.sendAction(action);
        System.out.println(amiMessage);
    }
}
