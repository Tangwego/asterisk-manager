package top.wdcc.asterisk.ami;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * Ami Message Interface
 *
 * @author wavin
 */
public interface AmiMessage {

    /**
     * AMI message type
     */
    enum Type {
        /**
         * type action
         */
        ACTION,
        /**
         * type response
         */
        RESPONSE,
        /**
         * type event
         */
        EVENT,
        /**
         * type auth request
         */
        AUTH_REQUEST,
        /**
         * unknow type
         */
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

    /** Auth Request **/
    String AMI_AUTH_REQUEST = "Asterisk Call Manager/1.3";

    /** AMI response **/
    String AMI_RESPONSE = "Response";

    /** AMI event **/
    String AMI_EVENT = "Event";

    /**
     * get message type
     * @return type message type
     */
    Type getType();

    /**
     * get message's field
     * @param field field name
     * @return field value
     */
    String getParam(String field);

    /**
     *  get all message fields
     * @return params
     */
    Map<String, String> getParams();

    /**
     * is execute success? (received after send action)
     * @return true or false
     */
    boolean isSuccess();

    /**
     * get response text
     * @return response text
     */
    String getResponseText();

    /**
     * get message
     * @return text message
     */
    String getMessage();
}
