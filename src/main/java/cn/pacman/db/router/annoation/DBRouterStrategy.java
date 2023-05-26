package cn.pacman.db.router.annoation;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DBRouterStrategy {
    boolean splitTable() default false;
}
