package top.wdcc.ast.ami;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.wdcc.ast.ami.actions.PingAction;

public class PingThread implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(PingThread.class);

    private AmiClient client;

    private long waitMills;

    public PingThread(AmiClient client, long timeout){
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
