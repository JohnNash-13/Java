package studyDay7.polymorphism;

/**
 * Sub
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 9:01
 **/
public class Sub extends Base{

    /**
     * 多态： 相同类型的变量，调用同一个方法时呈现出多种不同的行为特征。
     * ps： 访问的永远是编译时类型所决定的成员变量
     */

    public String book = "JAVA";

    public void test() {
        System.out.println("子类的覆盖父类的方法");
    }

    public void sub() {
        System.out.println("子类的普通方法");
    }

    public static void main(String[] args) {

        //以下编译时类型与运行时类型都一致，不存在多态
        Base base = new Base();
        System.out.println(base.book);
        base.base();
        base.test();

        Sub sub = new Sub();
        System.out.println(sub.book);
        sub.base();
        sub.sub();
        sub.test();

        //一下编译时类型与运行时类型不一致，因此存在多态
        // 向上转型
        Base base1 = new Sub();
        System.out.println(base1.book);
        base1.test();
        base1.base();

        // 使用var变量也会产生多态
        var v1 = new Sub();
        var v2 = base1;

    }
}
