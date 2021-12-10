package top.wdcc.asterisk.ami.apps;

import org.apache.commons.lang3.StringUtils;

public class Agi implements Application {
    private static final String APPLICATION_NAME = "AGI";

    private String url;

    private String[] arguments;

    public Agi(String url, String ... arguments){
        this.url = url;
        this.arguments = arguments;
    }

    @Override
    public String getName() {
        return APPLICATION_NAME;
    }

    @Override
    public String getData() {
        if (StringUtils.isAllEmpty(arguments)) {
            return url;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(url);
        sb.append(",");
        for (String arg: arguments) {
            if (StringUtils.isNotEmpty(arg)) {
                sb.append(arg);
                sb.append(",");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
