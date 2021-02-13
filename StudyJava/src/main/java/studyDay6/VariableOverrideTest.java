package studyDay6;

/**
 * VariableOverrideTest
 * 局部变量覆盖成员变量
 * @Author lhq
 * @Version 1.0
 * 2021/2/12 13:11
 **/
public class VariableOverrideTest {


    /**
     * 定义成为成员变量的弊端： 1. 增大了变量的生存空间，导致更大内存开销。 2. 扩大了变量的作用域，不利于程序的内聚性。
     * 成员变量的使用: 1. 描述某个类或某个对象的固有信息
     *              2， 需要变量存储类或实例运行的状态信息
     *              3. 需要在多个方法之间进行共享的变量
     *              ps： 否则，尽量使用方法局部变量
     */

    private String name = "kiki";

    private static double price = 7.77;

    public void info() {
        var name = "lhq";
        System.out.println(name);
        //虽然可以通过this访问到成员变量，但还是应该避免重名现象
        System.out.println(this.name);;
    }

    public static void main(String[] args) {
        var price = 65;
        //直接访问的是局部变量
        System.out.println(price);
        //使用类名限定
        System.out.println(VariableOverrideTest.price);
        new VariableOverrideTest().info();
    }
}
