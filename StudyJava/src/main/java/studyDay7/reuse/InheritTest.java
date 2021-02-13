package studyDay7.reuse;

/**
 * InheritTest
 * 实现复用的方式--继承
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 11:36
 **/
public class InheritTest {

    public static void main(String[] args) {

        var b = new Bird();
        b.breathe();
        b.fly();

        var w = new Wolf();
        w.breathe();
        w.run();
    }
}
