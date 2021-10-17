package top.wdcc.ast.agi.server;

import java.util.Map;

public class AgiMessage {
    private Map<String, String> params;

    public String getParam(String field){
        return params.get(field);
    }

    public Map<String, String> getParams() {
        return params;
    }
}
