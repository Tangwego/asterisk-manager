package top.wdcc.asterisk.ami.apps;

import org.apache.commons.lang3.StringUtils;

/**
 * playback app
 */
public class Playback implements Application {

    private static final String APPLICATION_NAME = "Playback";

    private String fileName;
    private String[] options;

    public Playback(String fileName, String ... options) {
        this.fileName = fileName;
        this.options = options;
    }

    @Override
    public String getName() {
        return APPLICATION_NAME;
    }

    @Override
    public String getData() {
        if (StringUtils.isEmpty(fileName)) {
            return "demo-thanks";
        }
        if (StringUtils.isAllEmpty(options)) {
            return fileName;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(fileName);
        sb.append(",");
        for (String d: options) {
            sb.append(d);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
