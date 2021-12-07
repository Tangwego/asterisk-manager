package top.wdcc.asterisk.ami;

/**
 * Ami Connection Exception
 *
 * @author Wavin
 */
public class AmiConnectException extends RuntimeException{

    public AmiConnectException(){
        super();
    }

    public AmiConnectException(String format, Object ... message){
        super(String.format(format, message));
    }
}
