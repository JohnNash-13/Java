package studyDay9;

/**
 * FinalErrorTest
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/18 15:53
 **/
public class FinalErrorTest {
    /**
     * 如果在构造器和初始化块中对final变量进行初始化，则不要在之前访问，否则访问的都是默认值。
     */

    final int age;

    {
        printAge();
        age = 6;
        System.out.println(age);
    }

    public void printAge() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        new FinalErrorTest();
    }
}
