package top.wdcc.asterisk.ami.apps;

import top.wdcc.asterisk.ami.Application;

public class Dial implements Application {
    public static final String APPLICATION_NAME = "Dial";

    public static final String DEFAULT_TECH = "SIP/";

    public Dial(){

    }

    @Override
    public String getName() {
        return APPLICATION_NAME;
    }

    @Override
    public String getData() {
        return "SIP/1002";
    }
}
