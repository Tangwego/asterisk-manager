package top.wdcc.asterisk.ami;

/**
 * like a trunk type
 * @see <a
 * href="https://github.com/asterisk-java/asterisk-java">
 * https://github.com/asterisk-java/asterisk-java
 * </a>
 * TechType
 * @author wavin
 */
public enum Tech {
    //
    UNKNOWN, SIP, DAHDI, LOCAL, IAX, IAX2
    // The DIALPLAN tech is used to suppresses output of the tech
    // when obtaining the fully qualified name of the endpoint.
    // Basically if you want to call into an asterisk dialplan extension
    // then the tech needs to be suppressed.
    , DIALPLAN
    // CONSOLE is sent when a call is made from the asterisk console.
    // These type of channels are ignored.
    , CONSOLE,

    PJSIP

    // PARKING & SIPPEER are used during call parking
    , PARKING, SIPPEER;
}
