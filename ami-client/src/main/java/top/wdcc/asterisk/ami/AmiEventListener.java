package top.wdcc.asterisk.ami;

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
