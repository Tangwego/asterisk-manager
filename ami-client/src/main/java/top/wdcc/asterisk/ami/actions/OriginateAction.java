package top.wdcc.asterisk.ami.actions;

import org.apache.commons.lang3.StringUtils;
import top.wdcc.asterisk.ami.AmiDefaultValue;
import top.wdcc.asterisk.ami.apps.Application;
import top.wdcc.asterisk.common.utils.UuidUtils;

/**
 * @see <a
 * href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Originate">
 * https://wiki.asterisk.org/wiki/display/AST/Asterisk+11+ManagerAction_Originate
 * </a>
 * @author wavin
 */
public class OriginateAction extends AmiAction {
    private static final String ACTION = "Originate";

    private static final String CHANNEL = "Channel";
    private static final String EXTEN = "Exten";
    private static final String CONTEXT = "Context";
    private static final String PRIORITY = "Priority";
    private static final String APPLICATION = "Application";
    private static final String DATA = "Data";
    private static final String TIMEOUT = "Timeout";
    private static final String CALLER_ID = "CallerId";
    private static final String VARIABLE = "Variable";
    private static final String ACCOUNT = "Account";
    private static final String EARLYMEDIA = "EarlyMedia";
    private static final String ASYNC = "Async";
    private static final String CODECS = "Codecs";

    public OriginateAction(String callee){
        this(callee, AmiDefaultValue.DEFAULT_CONTEXT, AmiDefaultValue.DEFAULT_PRIORITY);
    }

    public OriginateAction(String callee, String context, int priority) {
        this("SIP/" + callee, callee, context, priority, null,
                AmiDefaultValue.DEFAULT_TIMEOUT,
                AmiDefaultValue.DEFAULT_CALLERID,
                AmiDefaultValue.DEFAULT_VARIABLE,null,null,
                AmiDefaultValue.DEFAULT_ASYNC,null);
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
        if (app == null) {
            return this;
        }
        addParams(APPLICATION, app.getName());
        addParams(DATA, app.getData());
        return this;
    }

    public OriginateAction variable(String ... vars) {
        appendParams(VARIABLE, vars);
        return this;
    }

    public OriginateAction earlyMedia(String earlyMedia) {
        addParams(EARLYMEDIA, earlyMedia);
        return this;
    }

    public OriginateAction codec(String codec) {
        appendParams(CODECS, codec);
        return this;
    }
}
