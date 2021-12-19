package top.wdcc.asterisk.ami.actions;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Redirect">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Redirect
 * </a>
 * @author wavin
 */
public class RedirectAction extends AmiAction {
    private static final String ACTION = "Redirect";

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
