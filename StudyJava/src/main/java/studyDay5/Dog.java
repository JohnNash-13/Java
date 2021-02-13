package studyDay5;

/**
 * Dog
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/10 10:55
 **/
public class Dog {

    /**
     * this
     * 作为对象的默认引用两种情形：1. 构造器中使用该构造器正在初始化的对象 2， 在方法中引用调用该方法的对象
     * static修饰成员默认使用该类作为主调
     * 非static修饰成员默认使用this作为主调
     */

    public void jump() {
        System.out.println("狗跳起来了");
    }

    public void run() {
        //this.jump();
        jump();
        System.out.println("狗跑起来了");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
    }


}
