package top.wdcc.asterisk.ami;

import top.wdcc.asterisk.ami.apps.Dial;

public class DialAppTest {
    public static void main(String[] args) {
        Dial dial = new Dial(Tech.SIP, "1001", "default");
        System.out.println(dial.getData());
    }
}
