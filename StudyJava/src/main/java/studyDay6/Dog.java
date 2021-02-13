package studyDay6;

/**
 * Dog
 * 封装之狗
 * @Author lhq
 * @Version 1.0
 * 2021/2/12 16:47
 **/
public class Dog {

    /**
     * 封装： 将对象的状态信息隐藏在对象内部，不允许外部程序直接访问对象内部信息，
     *      而是通过该类所提供的方法来实现对内部信息的操作和访问。
     * 封装实际含义： 1. 将对象的成员变量和实现细节隐藏起来，不允许外部访问
     *             2， 将方法暴露出来，让方法对这些成员变量进行安全的访问和操作
     * 访问控制符： private (一般修饰成员变量)  ->   default   ->   protected   ->   public (类，包，子类，全局范围）
     *                                                      （子类重写父类）
     */


    private String name;
    private int age;

    public void setName(String name) {
        if(name.length() > 6 || name.length() < 2) {
            System.out.println("狗的名字不符合要求");
            return;
        }else {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if(age > 100 || age < 0) {
            System.out.println("狗的年龄不符合要求");
            return;
        }else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }
}
