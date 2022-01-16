package top.wdcc.asterisk.ami.apps;

import top.wdcc.asterisk.ami.AmiDefaultValue;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_ReadExten">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+Application_ReadExten
 * </a>
 * @author wavin
 */
public class ReadExten extends AbstractApplication {
    private static final String APPLICATION_NAME = "ReadExten";

    public ReadExten(String variable, String fileName, String context) {
        this(variable, fileName, context, null, AmiDefaultValue.DEFAULT_TIMEOUT);
    }

    public ReadExten(String variable, String fileName, String context, String[] option, long timeout) {
        super(APPLICATION_NAME);
        addOptions(variable);
        addOptions(fileName);
        addOptions(context);
        addOptions(option);
        addOptions(String.valueOf(timeout));
    }
}
