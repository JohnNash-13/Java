package studyDay9;

/**
 * FinalVariableTest
 * Final 修饰符
 * @Author lhq
 * @Version 1.0
 * 2021/2/18 10:47
 **/
public class FinalVariableTest {
    /**
     * final 可以修饰类，变量和方法。final修饰的变量不能被改变。
     * final 修饰的成员变量必须由程序员显式地指定初始值。
     */

    // final修饰的实例变量 必须在非静态代码块 或定义改变量时或构造器中指定初始值，而且只能在其中之一指定
    final int a = 6;

    final String str;
    final int c;

    // final修饰的类变量 必须在非静态初始化代码块 或者声明该变量时指定初始值，而且只能在其中之一指定
    final  static double d;
    {
        str = "hello";

    }
    static  {
        d = 5.6;
    }

    public FinalVariableTest() {
        c = 5;
    }

    public void changeFinal() {
        // 以下非法
        //d =12.3;
    }

    public static void main(String[] args) {
        var ft = new FinalVariableTest();
        System.out.println(ft.a);
        System.out.println(ft.c);
        System.out.println(ft.str);
    }
}
