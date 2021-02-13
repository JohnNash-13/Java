package studyDay7;

/**
 * Lhq
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 8:04
 **/
public class Lhq extends Person{

    public int a = 7;


    /**
     * 子类定义了和父类同名的实例变量，父类的会被覆盖（简单地被隐藏），在子类的实例方法无法访问到父类的实例变量，此时需要借助super来访问
     *
     * ps： this，super不能用static进行修饰
     *
     * 在 一个类中访问一个成员变量的顺序： 1. 方法中是否存在 2. 当前类中是否存在 3. 直接父类中是否存在
     */
    public void accessOwner() {
        System.out.println(a);
    }

    public void accessBase() {
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        var lhq = new Lhq();
        lhq.accessOwner();
        lhq.accessBase();
    }
}
