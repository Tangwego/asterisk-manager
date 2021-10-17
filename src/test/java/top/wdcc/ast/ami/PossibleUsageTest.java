package top.wdcc.ast.ami;

import top.wdcc.ast.ami.actions.AmiAction;
import top.wdcc.ast.ami.actions.ListCommandAction;
import top.wdcc.ast.ami.client.*;

public class PossibleUsageTest {
    public static void main(String[] args) throws InterruptedException {
        AmiClient amiClient = new AmiClient("192.168.0.120", 5038);
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

        amiClient.login("asterisk", "asterisk");
        AmiAction action = new ListCommandAction();
        AmiMessage amiMessage = amiClient.sendAction(action);

        amiClient.close();
    }
}
