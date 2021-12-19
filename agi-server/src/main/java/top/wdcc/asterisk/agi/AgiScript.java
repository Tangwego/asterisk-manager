package top.wdcc.asterisk.agi;

import java.lang.annotation.*;

/**
 * agi script annotation (not in use yet)
 * @author wavin
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
public @interface AgiScript {
    /**
     * defined script name
     * @return name
     */
    String name() default "";

    /**
     * defined script order
     * @return order
     */
    int order() default 0;
}
