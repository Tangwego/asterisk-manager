package top.wdcc.asterisk.ami;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.wdcc.asterisk.ami.actions.PingAction;

/**
 * ami ping thread,
 * useful in ami connect timeout scenarios.
 *
 * @author wavin
 */
public class AmiPingThread implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(AmiPingThread.class);

    private AmiClient client;
    private long waitMills;
    private boolean autoReconnect;
    private boolean running;

    public AmiPingThread(AmiClient client, long timeout){
        this(client, timeout, true);
    }

    public AmiPingThread(AmiClient client, long timeout, boolean autoReconnect){
        this.client = client;
        this.waitMills = timeout;
        this.autoReconnect = autoReconnect;
        this.running = true;
    }

    @Override
    public void run() {
        while (this.running) {
            try {
                if (client != null && client.isActive()) {
                    logger.info("send ping to Asterisk!");
                    AmiMessage amiMessage = client.sendAction(new PingAction());
                    logger.info("received pong from Asterisk: {}", amiMessage);
                } else {
                    if (this.autoReconnect) {
                        if (client == null) {
                            throw new IllegalStateException("The client cannot be null absolutely!");
                        }
                        client.login();
                    }
                }
                Thread.sleep(waitMills);
            } catch (Exception e) {
                logger.error("ami ping thread throw an exception: {}", e.getMessage());
            }
        }
    }

    void stop(){
        this.running = false;
    }
}
