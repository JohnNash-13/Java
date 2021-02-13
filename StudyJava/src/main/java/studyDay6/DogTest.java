package studyDay6;

import org.junit.jupiter.api.Test;

/**
 * DogTest
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/12 16:55
 **/
public class DogTest {

    /**
     * 绝大部分成员变量用private修饰，只有少部分用static修饰的类似全局变量的 或者构造器等才用public修饰
     */

    @Test
    public void test() {
        var d = new Dog();

        d.setAge(1000);
        System.out.println("狗的年龄：" + d.getAge());
        d.setAge(45);
        System.out.println("狗的年龄：" + d.getAge());
        d.setName("kkk");
        System.out.println("狗的姓名：" + d.getName());
    }
}
