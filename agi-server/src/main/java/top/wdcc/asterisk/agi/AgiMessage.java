package top.wdcc.asterisk.agi;

import java.util.HashMap;
import java.util.Map;

public class AgiMessage {
    public static final String AGI_NETWORK        = "agi_network";
    public static final String AGI_NETWORK_SCRIPT = "agi_network_script";
    public static final String AGI_REQUEST        = "agi_request";
    public static final String AGI_CHANNEL        = "agi_channel";
    public static final String AGI_LANGUAGE       = "agi_language";
    public static final String AGI_TYPE           = "agi_type";
    public static final String AGI_UNIQUEID       = "agi_uniqueid";
    public static final String AGI_VERSION        = "agi_version";
    public static final String AGI_CALLERID       = "agi_callerid";
    public static final String AGI_CALLERIDNAME   = "agi_calleridname";
    public static final String AGI_CALLINGPRES    = "agi_callingpres";
    public static final String AGI_CALLINGANI2    = "agi_callingani2";
    public static final String AGI_CALLINGTON     = "agi_callington";
    public static final String AGI_CALLINGTNS     = "agi_callingtns";
    public static final String AGI_DNID           = "agi_dnid";
    public static final String AGI_RDNIS          = "agi_rdnis";
    public static final String AGI_CONTEXT        = "agi_context";
    public static final String AGI_EXTENSION      = "agi_extension";
    public static final String AGI_PRIORITY       = "agi_priority";
    public static final String AGI_ENHANCED       = "agi_enhanced";
    public static final String AGI_ACCOUNTCODE    = "agi_accountcode";
    public static final String AGI_THREADID       = "agi_threadid";
    public static final String AGI_ARG_1          = "agi_arg_1";

    private Map<String, String> params;

    private int code = Integer.MIN_VALUE;

    private String message;

    private AgiType type;

    public AgiMessage(){
        this.params = new HashMap<>();
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void appendMessage(String message) {
        this.message += message;
    }

    public String getMessage() {
        return message;
    }

    public String getParam(String field){
        return params.get(field);
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void addParam(String field, String value) {
        this.params.put(field, value);
    }

    public void setType(AgiType type) {
        this.type = type;
    }

    public AgiType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "AgiMessage{" +
                "params=" + params +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", type=" + type +
                '}';
    }
}
