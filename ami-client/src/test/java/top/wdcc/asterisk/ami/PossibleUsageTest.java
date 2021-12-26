package top.wdcc.asterisk.ami;

import top.wdcc.asterisk.ami.actions.AmiAction;
import top.wdcc.asterisk.ami.actions.ListCommandAction;

public class PossibleUsageTest {
    public static void main(String[] args) throws InterruptedException {
        AmiClient amiClient = new AmiClient("192.168.2.100", 5038);
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

        amiClient.login("asterisk", "asterisk");
        AmiAction action = new ListCommandAction();
        AmiMessage amiMessage = amiClient.sendAction(action);

        amiClient.close();
    }
}
