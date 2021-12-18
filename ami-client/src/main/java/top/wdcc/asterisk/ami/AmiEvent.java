package top.wdcc.asterisk.ami;

import java.util.Map;

/**
 * ami event entity.
 *
 * @author wavin
 */
public class AmiEvent {

    private Map<String, String> params;

    public AmiEvent(AmiMessage message) {
        this.params = message.getParams();
    }

    public String getEventName(){
        return this.params.get(AmiMessage.AMI_EVENT);
    }

    public String getParam(String field){
        return params.get(field);
    }

    public Map<String, String> getParams(){
        return params;
    }

    @Override
    public String toString() {
        return "AmiEvent[" +
                "name=" + getEventName() +
                ", params=has [" + params.size() +
                "] fields]";
    }
}
