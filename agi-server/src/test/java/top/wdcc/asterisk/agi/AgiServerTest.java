package top.wdcc.asterisk.agi;

public class AgiServerTest {
    public static void main(String[] args) {
        AgiServer server = new AgiServer(8088);
        server.start();

    }
}
