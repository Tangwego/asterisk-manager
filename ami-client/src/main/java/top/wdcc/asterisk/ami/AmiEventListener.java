package top.wdcc.asterisk.ami;

/**
 * Ami Event Listener
 *
 * @author wavin
 */
public interface AmiEventListener {
    /**
     * on ami client login result
     * @param success login result
     */
    void onLogin(boolean success);

    /**
     * on ami event received
     * @param event ami event
     */
    void onEvent(AmiEvent event);
}
