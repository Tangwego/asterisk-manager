package top.wdcc.asterisk.agi;

import java.util.Map;

public class AgiMessage {
    private Map<String, String> params;

    public String getParam(String field){
        return params.get(field);
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void addParam(String field, String value) {
        this.params.put(field, value);
    }

    @Override
    public String toString() {
        return "AgiMessage{" +
                "params=" + params +
                '}';
    }
}
