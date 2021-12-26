package top.wdcc.asterisk.ami;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class AmiMonitorTest {
    private static final Logger logger = LoggerFactory.getLogger(AmiMonitorTest.class);
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            AmiClient amiClient = new AmiClient("192.168.121.63", 6031);
            amiClient.setEventListener(new AmiEventListener() {
                @Override
                public void onLogin(boolean success) {
                    // TODO login success
                }

                @Override
                public void onEvent(AmiEvent event) {
                    // TODO received event
                    logger.info("[SH3.1] ************收到事件************************");
                    logger.info("[SH3.1] EventName: {}", event.getEventName());
                    logger.info("[SH3.1] *******************************************");
                }
            });

            try {
                amiClient.login("dishui", "7moorcom");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();

        new Thread(()->{
            AmiClient amiClient = new AmiClient("192.168.121.63", 6032);
            amiClient.setEventListener(new AmiEventListener() {
                @Override
                public void onLogin(boolean success) {
                    // TODO login
                }

                @Override
                public void onEvent(AmiEvent event) {
                    // TODO received event
                    logger.info("[SH3.2] ************收到事件************************");
                    logger.info("[SH3.2] EventName: {}", event.getEventName());
                    logger.info("[SH3.2] *******************************************");
                }
            });

            try {
                amiClient.login("dishui", "7moorcom");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String next = scanner.next();
        }
    }
}
