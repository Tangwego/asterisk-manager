package top.wdcc.asterisk.agi;

public class TestAgiScript implements BaseAgiScript {
    @Override
    public void service(AgiChannel channel) {
        System.out.println(channel.getAgiScript());
    }
}
