package top.wdcc.ast.ami;

import top.wdcc.ast.utils.UuidUtils;

import java.util.HashMap;
import java.util.Map;


/**
 * 抽象Action类
 *
 * @author Wavin
 */
public abstract class AmiAction {

    // AMI action 请求
    private static final String AMI_ACTION = "Action";

    private static final String AMI_ACTIONID = "ActionId";

    private static final String AMI_EVENTS = "Events";

    private Map<String, String> params;

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

    public void addParams(String field, String value) {
        params.put(field, value);
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
