package com.m7.ast.ami.client;

/**
 * Ami连接异常
 *
 * @author TANG
 */
public class AmiConnectException extends RuntimeException{

    public AmiConnectException(){
        super();
    }

    public AmiConnectException(String format, Object ... message){
        super(String.format(format, message));
    }
}
