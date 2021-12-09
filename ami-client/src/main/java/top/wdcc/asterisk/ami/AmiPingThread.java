package top.wdcc.asterisk.ami;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.wdcc.asterisk.ami.actions.PingAction;

public class AmiPingThread implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(AmiPingThread.class);

    private AmiClient client;

    private long waitMills;

    public AmiPingThread(AmiClient client, long timeout){
        this.client = client;
        this.waitMills = timeout;
    }

    @Override
    public void run() {
        while (true) {
            if (client != null && client.isActive()) {
                logger.info("send ping to Asterisk!");
                AmiMessage amiMessage = client.sendAction(new PingAction());
                logger.info("received pong from Asterisk: {}", amiMessage);
            }
            try {
                Thread.sleep(waitMills);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
