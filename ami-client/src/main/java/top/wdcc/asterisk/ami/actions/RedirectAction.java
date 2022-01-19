package top.wdcc.asterisk.ami.actions;

import top.wdcc.asterisk.ami.AmiDefaultValue;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Redirect">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Redirect
 * </a>
 * @author wavin
 */
public class RedirectAction extends AmiAction {
    private static final String ACTION = "Redirect";

    public RedirectAction(String channel, String extern) {
        this(channel, extern, AmiDefaultValue.DEFAULT_CONTEXT, AmiDefaultValue.DEFAULT_PRIORITY);
    }

    public RedirectAction(String channel, String extern, String context) {
        this(channel, extern, context, AmiDefaultValue.DEFAULT_PRIORITY);
    }

    public RedirectAction(String channel, String extern, String context, int priority) {
        this(channel, null, extern, null, context, null, priority, 0);
    }

    public RedirectAction(String channel, String extraChannel, String exten, String extraExten, String context, String extraContext, int priority, int extraPriority) {
        super(ACTION);
        addParams("Channel", channel);
        addParams("ExtraChannel", extraChannel);
        addParams("Exten", exten);
        addParams("ExtraExten", extraExten);
        addParams("Context", context);
        addParams("ExtraContext", extraContext);
        addParams("Priority", String.valueOf(priority));
        addParams("ExtraPriority", String.valueOf(extraPriority));
    }
}
