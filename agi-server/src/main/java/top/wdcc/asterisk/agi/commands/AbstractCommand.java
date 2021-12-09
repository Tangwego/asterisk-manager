package top.wdcc.asterisk.agi.commands;

import java.util.ArrayList;
import java.util.List;

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
                this.arguments.add(arg);
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
                sb.append(arg);
                sb.append(" ");
            }
            return sb.toString();
        }
        return name;
    }
}
