package top.wdcc.asterisk.common.utils;

import java.util.UUID;

/**
 * a simple uuid generator
 * @author wavin
 */
public class UuidUtils {
    public static String getUuid(){
        return UUID.randomUUID().toString();
    }
}
