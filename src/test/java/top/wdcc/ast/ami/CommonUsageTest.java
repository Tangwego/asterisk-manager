package top.wdcc.ast.ami;

import top.wdcc.ast.ami.actions.ListCommandAction;
import top.wdcc.ast.ami.client.AmiClient;
import top.wdcc.ast.ami.client.AmiConfig;
import top.wdcc.ast.ami.client.AmiEventListener;
import top.wdcc.ast.ami.actions.AmiAction;
import top.wdcc.ast.ami.client.AmiEvent;
import top.wdcc.ast.ami.client.AmiMessage;

public class CommonUsageTest {
    public static void main(String[] args) throws InterruptedException {
        AmiConfig amiConfig = new AmiConfig();
        amiConfig.setUsername("asterisk");
        amiConfig.setSecret("asterisk");
        amiConfig.setHost("192.168.0.120");
        amiConfig.setPort(5038);
        AmiClient amiClient = new AmiClient(amiConfig);
        amiClient.setEventListener(new AmiEventListener() {
            @Override
            public void onLogin(boolean success) {
                // TODO login
            }

            @Override
            public void onEvent(AmiEvent event) {
                // TODO received event
            }
        });

        amiClient.login();
        AmiAction action = new ListCommandAction();
        AmiMessage amiMessage = amiClient.sendAction(action);

        amiClient.close();
    }
}
