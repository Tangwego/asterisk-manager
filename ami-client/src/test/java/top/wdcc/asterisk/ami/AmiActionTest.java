package top.wdcc.asterisk.ami;

import top.wdcc.asterisk.ami.actions.PingAction;

public class AmiActionTest {
    public static void main(String[] args) {
        AmiAction amiAction = new PingAction();
        amiAction.appendParams("a", "b", "e", "F");
        amiAction.appendParams("a", "c");
        amiAction.appendParams("a", "d");
        System.out.println(amiAction.toString());
    }
}
