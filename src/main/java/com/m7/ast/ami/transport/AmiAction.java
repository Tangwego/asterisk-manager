package com.m7.ast.ami.transport;

import java.util.HashMap;
import java.util.Map;


/**
 * 抽象Action类
 *
 * @author TANG
 */
public abstract class AmiAction {

    // AMI action 请求
    public static final String AMI_ACTION = "Action";

    private String name;
    private Map<String, String> params;

    public AmiAction(String name){
        this.name = name;
        params = new HashMap<>();
    }

    public void addParams(String field, String value) {
        params.put(field, value);
    }

    public void delParams(String field){
        params.remove(field);
    }

    public String getName() {
        return name;
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
                "name='" + name + '\'' +
                ", params=" + params +
                '}';
    }
}
