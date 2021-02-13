package studyDay7.initialization_block;

/**
 * InstanceInitTest
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 12:09
 **/
public class InstanceInitTest {


    /**
     * 对实例变量执行初始化的顺序是： 先执行实例初始化块或声明实例变量时指定的初始值（根据顺序），在执行构造器里面的指定初始值
     */

    {
        a = 6;
    }

    int a = 9;

    public static void main(String[] args) {
        System.out.println(new InstanceInitTest().a);
    }
}
