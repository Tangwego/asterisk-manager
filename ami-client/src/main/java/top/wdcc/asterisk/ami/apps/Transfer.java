package top.wdcc.asterisk.ami.apps;

import top.wdcc.asterisk.ami.Tech;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_Transfer">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_Transfer
 * </a>
 * @author wavin
 */
public class Transfer extends AbstractApplication {

    private static final String APPLICATION_NAME = "Transfer";

    public Transfer(String dest){
        this(Tech.SIP, dest);
    }

    public Transfer(Tech type, String dest) {
        super(APPLICATION_NAME);
        addOptions(type.name(), "/", dest);
    }
}
