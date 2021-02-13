package studyDay6;

/**
 * ConstructorTest
 * 构造器
 * @Author lhq
 * @Version 1.0
 * 2021/2/12 17:33
 **/
public class ConstructorTest {

    /**
     * 构造器能够被重载
     * 构造器是创建java对象的重要途径但不是完全由其创建
     */

    private String name;
    private int count;

    private ConstructorTest(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        var ct = new ConstructorTest("kiki",22);
        System.out.println(ct.name);
        System.out.println(ct.count);
    }
}
