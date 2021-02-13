package studyDay7;

/**
 * SubClass
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 7:55
 **/
public class SubClass extends Base{

    //当子类覆盖父类方法时，报错
    /*    public void test() {
        System.out.println("我是一个实例方法");
        }*/
    /**
     * 此时只能在子类方法中访问父类被覆盖的方法，
     * 如果是实例方法，则用 super，如果是类方法，则通过父类类名
     *
     * ps: 如果父类方法为private，则无法重写
     */
    public void test1() {
        Base.test();
    }

    public static void test2() {
        System.out.println("我并非重写了父类方法，这是一个新方法");
    }

    public static void main(String[] args) {
        var sc = new SubClass();
        sc.test1();
        SubClass.test2();
    }
}
