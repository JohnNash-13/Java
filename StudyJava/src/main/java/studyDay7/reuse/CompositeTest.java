package studyDay7.reuse;

/**
 * CompositeTest
 * 实现复用--组合
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 11:44
 **/
public class CompositeTest {

    public static void main(String[] args) {

        //显示创建被组合对象
        var a1 = new Animal();
        var b = new Bird1(a1);
        b.breathe();
        b.fly();

        //显示创建被组合对象
        var a2 = new Animal();
        var w = new Wolf1(a2);
        w.breathe();
        w.run();
    }
}
