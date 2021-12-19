package top.wdcc.asterisk.ami.actions;

import org.apache.commons.lang3.StringUtils;
import top.wdcc.asterisk.common.utils.UuidUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * abstract ami action
 *
 * @author wavin
 */
public abstract class AmiAction {

    private static final String AMI_ACTION = "Action";

    private static final String AMI_ACTIONID = "ActionId";

    private static final String AMI_EVENTS = "Events";

    private final Map<String, String> params;

    public AmiAction(String name){
        this(name, UuidUtils.getUuid());
    }

    public AmiAction(String name, String actionId){
        this(name, actionId, true);
    }

    public AmiAction(String name, String actionId, boolean hasEvent){
        params = new HashMap<>();
        this.params.put(AMI_ACTION, name);
        this.params.put(AMI_ACTIONID, actionId);
        if (!hasEvent) {
            this.params.put(AMI_EVENTS, "off");
        }
    }

    public String getId() {
        return params.get(AMI_ACTIONID);
    }

    public void addParams(String field, String value) {
        if (StringUtils.isAnyEmpty(field, value)) {
            return;
        }
        params.put(field, value);
    }

    public void appendParams(String field, String ... value) {
        if (StringUtils.isEmpty(field) || StringUtils.isAllEmpty(value)) {
            return;
        }
        String s = params.get(field);
        StringBuilder sb = new StringBuilder();
        if (StringUtils.isNotEmpty(s)) {
            sb.append(s);
            sb.append(",");
        }
        if (value.length > 0) {
            for (String v: value) {
                if (StringUtils.isNotEmpty(v)) {
                    sb.append(v);
                    sb.append(",");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        params.put(field, sb.toString());
    }

    public void delParams(String field){
        params.remove(field);
    }

    public String getName() {
        return params.get(AMI_ACTION);
    }

    public String getParam(String field){
        return params.get(field);
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void clear(){
        params.clear();
    }

    @Override
    public String toString() {
        return "AmiAction{" +
                "id='" + params.get(AMI_ACTIONID) + '\'' +
                ", name='" + params.get(AMI_ACTION) + '\'' +
                ", params=" + params +
                '}';
    }
}
