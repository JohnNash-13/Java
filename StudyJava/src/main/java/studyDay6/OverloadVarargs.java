package studyDay6;

/**
 * OverloadVarargs
 * 形参可变重载
 * @Author lhq
 * @Version 1.0
 * 2021/2/12 12:28
 **/
public class OverloadVarargs {

    public void test(String msg) {
        System.out.println("只有一个arg的重载方法");
    }

    public void test(String... books) {
        System.out.println("形参可变的重载方法");
    }

    public static void main(String[] args) {
        var olv = new OverloadVarargs();
        olv.test("wwww");
        olv.test("1", "2");
        olv.test("w");
        //此时只能通过传入数组的方式为一个参数想要执行形参可变的方法
        // 一般不推荐形参可变方法重载
        olv.test(new String[] {"S"});
    }
}
