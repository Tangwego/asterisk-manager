package com.m7.ast.ami.client;

import com.m7.ast.ami.transport.AmiEvent;

/**
 * Ami事件监听接口
 *
 * @author TANG
 */
public interface AmiEventListener {
    /**
     * 登录动作触发回调
     * @param success
     */
    void onLogin(boolean success);

    /**
     * 收到事件回调
     * @param event
     */
    void onEvent(AmiEvent event);
}
