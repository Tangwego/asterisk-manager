package top.wdcc.asterisk.agi;

import top.wdcc.asterisk.agi.commands.AgiCommand;
import top.wdcc.asterisk.agi.commands.SayNumberCommand;
import top.wdcc.asterisk.agi.commands.SayPhoneticCommand;

public class AgiCommandTest {
    public static void main(String[] args) {
        AgiCommand sayPhoneticCommand = new SayPhoneticCommand("666");
        System.out.println(sayPhoneticCommand.getCommandString());

        AgiCommand sayNumberCommand = new SayNumberCommand(666);
        System.out.println(sayNumberCommand.getCommandString());
    }
}
