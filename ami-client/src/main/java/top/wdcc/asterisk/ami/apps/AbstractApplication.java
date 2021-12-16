package top.wdcc.asterisk.ami.apps;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractApplication implements Application {

    private List<String> options;

    private static final String OPTIONS_SPLITOR = ",";

    private String app;

    public AbstractApplication(String appName){
        this.app = appName;
    }

    @Override
    public String getName() {
        return this.app;
    }

    protected void addOptions(String ... options) {
        if (StringUtils.isAllEmpty(options)) {
            return;
        }
        if (this.options == null) {
            this.options = new ArrayList<>();
        }

        for (String option: options) {
            if (StringUtils.isNotEmpty(option)) {
                this.options.add(option);
            }
        }
    }

    @Override
    public String getData() {
        if (this.options == null || this.options.size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String d: this.options) {
            if (StringUtils.isNotEmpty(d)) {
                sb.append(d);
                sb.append(OPTIONS_SPLITOR);
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
