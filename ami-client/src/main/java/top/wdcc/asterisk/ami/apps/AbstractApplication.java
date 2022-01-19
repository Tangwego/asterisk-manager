package top.wdcc.asterisk.ami.apps;

import org.apache.commons.lang3.StringUtils;
import top.wdcc.asterisk.ami.AmiDefaultValue;

import java.util.ArrayList;
import java.util.List;

/**
 * an abstract application implementation
 * super class for other implementation classes
 * @author wavin
 */
public abstract class AbstractApplication implements Application {

    private String delimiter;

    protected List<String> options;

    private String app;

    public AbstractApplication(String appName){
        this.app = appName;
    }

    @Override
    public String getName() {
        return this.app;
    }

    protected void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    protected String getDelimiter(){
        return StringUtils.defaultString(this.delimiter, AmiDefaultValue.DEFAULT_DELIMITER);
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
                sb.append(getDelimiter());
            }
        }
        if (StringUtils.isNotEmpty(getDelimiter())) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
