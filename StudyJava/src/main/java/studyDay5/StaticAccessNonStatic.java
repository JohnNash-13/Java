package studyDay5;

/**
 * StaticAccessNonStatic
 * 静态成员不能访问非静态成员
 * @Author lhq
 * @Version 1.0
 * 2021/2/10 11:03
 **/
public class StaticAccessNonStatic {
    /**
     * static修饰的成员属于类本身
     * 非static修饰的成员属于类的实例,不属于该类
     */

    public void run() {
        System.out.println("我是非静态方法");
    }

    public static void main(String[] args) {
        //以下报错
        //run();
        new StaticAccessNonStatic().run();
    }
}
