package Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author fatiaoyezi
 * @version 1.0
 * @date 2020-5-27 20:14
 *
 * 注解中属性可以有默认值，默认值需要用 default 关键值指定
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TestAnnotation {

    int id() default -1;

    String msg() default "Hi annotation";

}
