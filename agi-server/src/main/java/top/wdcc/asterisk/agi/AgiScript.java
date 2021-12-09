package top.wdcc.asterisk.agi;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
public @interface AgiScript {
    /**
     * defined script name
     * @return
     */
    String name() default "";

    /**
     * defined script order
     * @return
     */
    int order() default 0;
}
