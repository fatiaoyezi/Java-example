package Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.Annotation;

/**
 * @author fatiaoyezi
 * @version 1.0
 * @date 2020-5-27 20:15
 */
@Check("hi value")
@TestAnnotation(id=3,msg="hello annotation")
@Perform
public class Test {

    @Check(value="hi")
    int a;

    @Perform
    public void testMethod(){}

    @SuppressWarnings("deprecation")
    public void test1(){

    }


    public static void main(String[] args) {
        boolean hasAnnotation = Test.class.isAnnotationPresent(TestAnnotation.class);

        if (hasAnnotation) {
            TestAnnotation annotation = Test.class.getAnnotation(TestAnnotation.class);
            System.out.println("id: " + annotation.id());
            System.out.println("msg: " + annotation.msg());
        }


        try {
            Field a = Test.class.getDeclaredField("a");
            a.setAccessible(true);
            //获取一个成员变量上的注解
            Check check = a.getAnnotation(Check.class);

            if ( check != null ) {
                System.out.println("check value:"+check.value());
            }

            Method testMethod = Test.class.getDeclaredMethod("testMethod");

            if ( testMethod != null ) {
                // 获取方法中的注解
                Annotation[] ans = (Annotation[]) testMethod.getAnnotations();
                for( int i = 0;i < ans.length;i++) {

                }
            }
        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
