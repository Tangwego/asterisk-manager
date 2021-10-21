package top.wdcc.ast.ami;

import top.wdcc.ast.ami.client.AmiEvent;

/**
 * Ami Event Listener
 *
 * @author Wavin
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
