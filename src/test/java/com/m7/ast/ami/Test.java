package com.m7.ast.ami;

import com.m7.ast.ami.actions.ListCommandAction;
import com.m7.ast.ami.client.AmiClient;
import com.m7.ast.ami.client.AmiConfig;
import com.m7.ast.ami.client.AmiEventListener;
import com.m7.ast.ami.transport.AmiAction;
import com.m7.ast.ami.transport.AmiEvent;
import com.m7.ast.ami.transport.AmiMessage;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        AmiClient amiClient = new AmiClient();
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
        AmiConfig amiConfig = new AmiConfig();
        amiConfig.setUsername("dishui");
        amiConfig.setSecret("7moorcom");
        amiClient.connect("192.168.121.63", 6058, 30, amiConfig);
        AmiAction action = new ListCommandAction();
        AmiMessage amiMessage = amiClient.sendAction(action);

        amiClient.close();
    }
}
