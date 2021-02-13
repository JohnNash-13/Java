package studyDay7.polymorphism;

/**
 * Base
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 8:49
 **/
public class Base {

    /**
     * 多态
     */

    public int book = 6;

    public void base() {
        System.out.println("父类的普通方法");
    }

    public void test() {
        System.out.println("父类的被覆盖的方法");
    }

}
