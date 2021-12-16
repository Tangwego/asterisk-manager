package top.wdcc.asterisk.ami;

import top.wdcc.asterisk.ami.actions.AgiAction;
import top.wdcc.asterisk.ami.actions.AmiAction;
import top.wdcc.asterisk.ami.actions.ListCommandAction;

public class AgiActionTest {
    public static void main(String[] args) throws InterruptedException {
        AmiClient amiClient = new AmiClient("192.168.121.63", 6031);
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

        amiClient.login("dishui", "7moorcom");
        AmiAction action = new AgiAction("aa", "hello");
        AmiMessage amiMessage = amiClient.sendAction(action);

        amiClient.close();
    }
}
