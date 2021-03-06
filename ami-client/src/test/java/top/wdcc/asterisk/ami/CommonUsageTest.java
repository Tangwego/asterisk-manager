package top.wdcc.asterisk.ami;

import top.wdcc.asterisk.ami.actions.AmiAction;
import top.wdcc.asterisk.ami.actions.ListCommandAction;

import java.util.Scanner;

public class CommonUsageTest {
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
        AmiAction action = new ListCommandAction();
        AmiMessage amiMessage = amiClient.sendAction(action);

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {

        }

        amiClient.close();
    }
}
