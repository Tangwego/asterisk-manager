package top.wdcc.asterisk.agi;

import top.wdcc.asterisk.agi.commands.*;

public class AgiCommandTest {
    public static void main(String[] args) {
        AgiCommand sayPhoneticCommand = new SayPhoneticCommand("666");
        System.out.println(sayPhoneticCommand.getCommandString());

        AgiCommand sayNumberCommand = new SayNumberCommand(666);
        System.out.println(sayNumberCommand.getCommandString());

        AgiCommand waitForDigitCommand = new WaitForDigitCommand("1111");
        System.out.println(waitForDigitCommand.getCommandString());

        AgiCommand getVariableCommand = new GetVariableCommand("aa");
        System.out.println(getVariableCommand.getCommandString());

        AgiCommand receiveCharCommand = new ReceiveCharCommand();
        System.out.println(receiveCharCommand.getCommandString());
    }
}
