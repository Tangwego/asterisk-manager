package top.wdcc.asterisk.ami.actions;

import org.apache.commons.lang3.StringUtils;
import top.wdcc.asterisk.ami.apps.Application;
import top.wdcc.asterisk.common.utils.UuidUtils;

public class OriginateAction extends AmiAction {
    private static final String ACTION = "originate";

    public static final String DEFAULT_CALLERID = "asterisk";
    public static final String DEFAULT_CONTEXT = "default";
    public static final int DEFAULT_PRIORITY = 1;
    public static final int DEFAULT_TIMEOUT = 30000;
    public static final boolean DEFAULT_ASYNC = true;
    public static final String DEFAULT_VARIABLE = "SIPADDHEADER=Call-Info:\\; answer-after=0";

    public static final String CHANNEL = "channel";
    public static final String EXTEN = "exten";
    public static final String CONTEXT = "context";
    public static final String PRIORITY = "priority";
    public static final String APPLICATION = "application";
    public static final String DATA = "data";
    public static final String TIMEOUT = "timeout";
    public static final String CALLER_ID = "callerid";
    public static final String VARIABLE = "variable";
    public static final String ACCOUNT = "account";
    public static final String EARLYMEDIA = "earlymedia";
    public static final String ASYNC = "async";
    public static final String CODECS = "codecs";

    public OriginateAction(String callee){
        this(callee, DEFAULT_CONTEXT, DEFAULT_PRIORITY);
    }

    public OriginateAction(String callee, String context, int priority) {
        this("SIP/" + callee, callee, context, priority, null, DEFAULT_TIMEOUT, DEFAULT_CALLERID, DEFAULT_VARIABLE,null,null,DEFAULT_ASYNC,null);
    }

    public OriginateAction(String channel, String exten, String context, int priority, Application app, long timeout, String callerId, String variable, String account, String earlyMedia, boolean async, String codecs) {
        super(ACTION);
        addParams(CHANNEL, StringUtils.defaultString(channel, UuidUtils.getUuid()));
        addParams(EXTEN, exten);
        addParams(CONTEXT, context);
        priority(priority);
        application(app);
        timeout(timeout);
        addParams(CALLER_ID, callerId);
        addParams(VARIABLE, variable);
        addParams(ACCOUNT, account);
        addParams(EARLYMEDIA, earlyMedia);
        async(async);
        addParams(CODECS, codecs);
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

    public OriginateAction application(Application app){
        if (app == null) return this;
        addParams(APPLICATION, app.getName());
        addParams(DATA, app.getData());
        return this;
    }
}
