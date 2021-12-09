package top.wdcc.asterisk.agi;

public interface BaseAgiScript {

    /**
     * handle agi channel
     * @param channel
     */
    void service(AgiChannel channel);
}
