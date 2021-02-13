package studyDay6;

/**
 * Peach
 * 重写父类方法
 * @Author lhq
 * @Version 1.0
 * 2021/2/12 18:08
 **/
public class Peach extends Fruit{

    /**
     * 方法重写（ override）
     * 遵循 “ 两同两小一大 ”： 两同： 1. 方法名相同， 2. 形参列表相同
     *                     两小： 1. 子类返回值类型应小于或等于父类返回值类型 2. 子类方法抛出异常小于或等于父类方法抛出异常
     *                     一大： 1. 子类方法的访问权限比父类方法访问权限大或相等
     *                     ps： 重写方法要么都是类方法或者实例方法，不能一个类方法一个实例方法
     */

    public void flower() {
        System.out.println("我不会开花");
    }

    public static void main(String[] args) {
        var p = new Peach();
        p.weight = 12.00;
        p.info();
        p.flower();
    }
}
