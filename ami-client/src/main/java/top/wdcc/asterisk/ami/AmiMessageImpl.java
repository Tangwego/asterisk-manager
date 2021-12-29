package top.wdcc.asterisk.ami;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ami message implementation
 *
 * @author wavin
 */
public class AmiMessageImpl implements AmiMessage {
    private Type type;
    private Map<String, String> params;
    private List<String> body;
    private boolean success;

    public AmiMessageImpl(){
        params = new HashMap<>();
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getParam(String field){
        return params.get(field);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }

    @Override
    public boolean isSuccess() {
        if (type == Type.RESPONSE) {
            return StringUtils.equalsIgnoreCase(params.get(AMI_RESPONSE), "SUCCESS");
        }
        return true;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }


    @Override
    public String getResponseText() {
        return params.get(AMI_RESPONSE);
    }

    @Override
    public String getMessage() {
        return params.get("Message");
    }

    @Override
    public void addBody(String line) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(line);
    }

    @Override
    public List<String> getBody() {
        return this.body;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void addParams(String field, String value) {
        params.put(field, value);
    }

    @Override
    public String toString() {
        return "AmiMessage[" +
                "type=" + type +
                ", params=has [" + params.size() +
                "] fields]";
    }
}
