package top.wdcc.asterisk.ami.apps;

import org.apache.commons.lang3.StringUtils;
import top.wdcc.asterisk.ami.Tech;

/**
 * dial app
 */
public class Dial extends AbstractApplication {
    private static final String APPLICATION_NAME = "Dial";

    private static final Tech DEFAULT_TECH = Tech.SIP;

    private Tech tech;

    private String callee;

    private String trunk;

    public Dial(String callee) {
        this(DEFAULT_TECH, callee);
    }

    public Dial(Tech tech, String callee) {
        this(tech, callee, null);
    }

    public Dial(Tech tech,  String callee, String trunk){
        this.tech = tech;
        this.callee = callee;
        this.trunk = trunk;
    }

    @Override
    public String getName() {
        return APPLICATION_NAME;
    }

    @Override
    public String getData() {
        if (StringUtils.isEmpty(trunk)) {
            return String.format("%s/%s", tech, callee);
        }
        return String.format("%s/%s@%s", tech, callee, trunk);
    }
}
