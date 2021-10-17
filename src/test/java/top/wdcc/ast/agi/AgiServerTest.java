package top.wdcc.ast.agi;

import top.wdcc.ast.agi.server.AgiServer;

public class AgiServerTest {
    public static void main(String[] args) {
        AgiServer server = new AgiServer(8088);
        server.start();

    }
}
