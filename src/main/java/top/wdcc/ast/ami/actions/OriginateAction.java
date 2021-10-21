package top.wdcc.ast.ami.actions;

import org.apache.commons.lang3.StringUtils;
import top.wdcc.ast.ami.AmiAction;

public class OriginateAction extends AmiAction {
    private static final String ACTION = "originate";

    public static final String CHANNEL = "Channel";
    public static final String EXTEN = "Exten";
    public static final String CONTEXT = "Context";
    public static final String CALLER_ID = "CallerID";
    public static final String PRIORITY = "Priority";
    public static final String TIMEOUT = "Timeout";
    public static final String ASYNC = "Async";
    public static final String APPLICATION = "Application";
    public static final String DATA = "Data";
    public OriginateAction(String caller, String callee, String context) {
        super(ACTION);
        addParams(CHANNEL, "SIP/" + callee);
        addParams(EXTEN, callee);
        addParams(CONTEXT, context);
        addParams(CALLER_ID, caller);
        priority(1);
    }

    public OriginateAction priority(int priority) {
        addParams(PRIORITY, String.valueOf(priority));
        return this;
    }

    public OriginateAction timeout(long timeout){
        addParams(TIMEOUT, String.valueOf(timeout));
        return this;
    }

    public OriginateAction async(boolean async){
        addParams(ASYNC, String.valueOf(async));
        return this;
    }

    public OriginateAction application(String app){
        addParams(APPLICATION, app);
        return this;
    }

    public OriginateAction data(Object ... data) {
        String app = getParam(APPLICATION);
        if (StringUtils.isEmpty(app)) {
            throw new IllegalArgumentException("Application is null!");
        }
        String param = getParam(DATA);
        StringBuilder sb = new StringBuilder();
        if (StringUtils.isNotEmpty(param)) {
            sb.append(param);
            sb.append(" ");
        }
        for (Object o: data) {
            sb.append(o);
            sb.append(" ");
        }
        addParams(DATA, sb.toString());
        return this;
    }

}
