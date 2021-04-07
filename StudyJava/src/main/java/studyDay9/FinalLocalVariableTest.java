package studyDay9;

/**
 * FinalLocalVariableTest
 * final修饰局部变量
 * @Author lhq
 * @Version 1.0
 * 2021/4/7 16:23
 **/
public class FinalLocalVariableTest {

    public void test(final int a) {
        // 1.不能对final 修饰的形参赋值
        //a = 6;
    }

    public static void main(String[] args) {

        final String str = "hello";
        // 2.不会对 final 修饰的局部变量 进行初始化 可以显示指定值
        //   但是只能赋值一次，再次赋值将会报错
        // str = "dsa";

        final double d;
        d = 1.13;
        System.out.println(d);

    }
}
