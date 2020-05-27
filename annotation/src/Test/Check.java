package Test;

/**
 * @author fatiaoyezi
 * @version 1.0
 * @date 2020-5-27 20:39
 * 如果一个注解内仅仅只有一个名字为 value 的属性时，应用这个注解时可以直接接属性值填写到括号内。
 */
public @interface Check {

    String value();
}
