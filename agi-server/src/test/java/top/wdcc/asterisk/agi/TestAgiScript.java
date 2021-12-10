package top.wdcc.asterisk.agi;

public class TestAgiScript implements BaseAgiScript {
    @Override
    public void service(AgiChannel channel) {
        AgiMessage answer = channel.answer();
        System.out.println(answer);
        AgiMessage agiMessage = channel.streamFile("demo-abouttotry");
        System.out.println(agiMessage);
        System.out.println(channel.getArguments());
    }
}
