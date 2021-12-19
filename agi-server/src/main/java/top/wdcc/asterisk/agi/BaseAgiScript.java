package top.wdcc.asterisk.agi;

/**
 * the script interface for agi call
 * @author wavin
 */
public interface BaseAgiScript {

    /**
     * handle agi channel
     *
     * @param channel agi channel
     */
    void service(AgiChannel channel);
}
