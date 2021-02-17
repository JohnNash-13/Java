package studyDay8;

/**
 * NullAccessTest
 * 实例为null访问所属类的类成员
 * @Author lhq
 * @Version 1.0
 * 2021/2/17 21:10
 **/
public class NullAccessTest {

    private static void test() {
        System.out.println("static 修饰的方法");
    }

    private void test2() {
        System.out.println("实例方法");
    }

    public static void main(String[] args) {

        /**
         * static:
         * 类成员不能访问实例成员，because 类成员的作用域大于实例成员的作用域，反之即可。
         */

        NullAccessTest nullAccessTest = null;
        nullAccessTest.test();
        //报 NullPointerException 异常
        nullAccessTest.test2();
    }
}
