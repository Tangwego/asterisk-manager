package top.wdcc.asterisk.ami;

import top.wdcc.asterisk.ami.apps.Dial;
import top.wdcc.asterisk.ami.apps.Exec;
import top.wdcc.asterisk.ami.apps.ExecIf;

/**
 * @author wavin
 * @date 2022/1/19
 */
public class ExecAppTest {
    public static void main(String[] args) {
        Exec exec = new Exec(new Dial("aa"));
        System.out.println(exec.getName() + " " + exec.getData());

        ExecIf execif = new ExecIf("a>b",new Dial("aa"), new Dial("bb"));
        System.out.println(execif.getName() + " " + execif.getData());
    }
}
