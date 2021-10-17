package top.wdcc.ast.ami.actions;

public class OriginateAction extends AmiAction {
    private static final String ACTION = "Originate";
    public OriginateAction(String caller, String callee, String context) {
        super(ACTION);
        addParams("Channel", "SIP/" + callee);
        addParams("Exten", callee);
        addParams("Context", context);
        addParams("CallerID", caller);
    }

    public void setPriority(int priority) {
        addParams("Priority", String.valueOf(priority));
    }

    public void setTimeout(long timeout){
        addParams("Timeout", String.valueOf(timeout));
    }

    public void setAsync(boolean async){
        addParams("Async", String.valueOf(async));
    }

}
