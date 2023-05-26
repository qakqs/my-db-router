package cn.pacman.db.router.annoation;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DBRouter {
    /**
     * 分库分表字段
     * @return
     */
    String key() default "";
}
