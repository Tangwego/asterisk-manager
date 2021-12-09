package top.wdcc.asterisk.ami;

import top.wdcc.asterisk.ami.apps.Agi;


public class AgiAppTest {
    public static void main(String[] args) {
        Agi agi = new Agi("agi://192.168.2.100:8080?111=aaa", "hah", "aka");
        System.out.println(agi.getData());
    }
}
