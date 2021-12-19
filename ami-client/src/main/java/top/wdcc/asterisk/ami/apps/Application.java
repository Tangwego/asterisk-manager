package top.wdcc.asterisk.ami.apps;

/**
 * an interface for asterisk dialplan application
 * @author wavin
 */
public interface Application {
    /**
     * get application name
     * @return application name
     */
    String getName();

    /**
     * get application data
     * @return application data
     */
    String getData();
}
