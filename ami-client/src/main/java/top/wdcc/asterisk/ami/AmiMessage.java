package top.wdcc.asterisk.ami;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * Ami Message Interface
 *
 * @author wavin
 */
public interface AmiMessage {

    /** AMI 消息类型  **/
    enum Type {
        ACTION,
        RESPONSE,
        EVENT,
        AUTH_REQUEST,
        UNKNOW;
        public static Type from(String value){
            for (Type type: values()) {
                if (StringUtils.equalsIgnoreCase(type.name(), value)) {
                    return type;
                }
            }
            return UNKNOW;
        }
    }

    /** 认证 **/
    String AMI_AUTH_REQUEST = "Asterisk Call Manager/1.3";

    /** AMI 响应 **/
    String AMI_RESPONSE = "Response";

    /** AMI 事件 **/
    String AMI_EVENT = "Event";

    /** 获取消息类型 **/
    Type getType();

    /** 获取消息参数字段 **/
    String getParam(String field);

    /** 获取消息所有参数 **/
    Map<String, String> getParams();

    /** 是否执行成功(如果是发送Action) **/
    boolean isSuccess();

    /** 获取响应消息 **/
    String getResponseText();

    /** 获取Message **/
    String getMessage();
}
