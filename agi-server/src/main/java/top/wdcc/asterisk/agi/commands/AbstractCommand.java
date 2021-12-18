package top.wdcc.asterisk.agi.commands;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * this is an abstract and a base implementation for {@code AgiCommand}
 * @see top.wdcc.asterisk.agi.commands.AgiCommand
 * @author wavin
 */
public abstract class AbstractCommand implements AgiCommand {

    private String name;

    private List<String> arguments;

    public AbstractCommand(String name) {
        this.name = name;
        this.arguments = new ArrayList<>();
    }

    protected void addArgument(String ... args) {
        if (args != null && args.length > 0) {
            for (String arg: args) {
                if (StringUtils.isNotEmpty(arg)) {
                    this.arguments.add(arg);
                }
            }
        }
    }

    @Override
    public String getCommandString() {
        if (this.arguments.size() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(" ");
            for (String arg: arguments) {
                if (StringUtils.isNotEmpty(arg)) {
                    sb.append(arg);
                    sb.append(" ");
                }
            }
            return sb.toString();
        }
        return name;
    }
}
