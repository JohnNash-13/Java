package studyDay6;

/**
 * Overload
 * 方法重载
 * @Author lhq
 * @Version 1.0
 * 2021/2/12 12:22
 **/
public class Overload {

    /**
     * 方法重载：同一个类方法名相同，参数列表不同。
     */

    public void test() {
        System.out.println("no args");
    }

    public void test(String msg) {
        System.out.println("arg: " + msg);
    }

    public static void main(String[] args) {
        var ol = new Overload();
        ol.test();
        ol.test("kiki");
    }

}
