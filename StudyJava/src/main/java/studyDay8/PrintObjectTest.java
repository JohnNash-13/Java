package studyDay8;

/**
 * PrintObjectTest
 * 打印对象和 toString方法
 * @Author lhq
 * @Version 1.0
 * 2021/2/17 17:01
 **/
public class PrintObjectTest {

    public static void main(String[] args) {
        var p = new Person("kiki");
        // 返回 类名 + @ + hashCode值
        System.out.println(p);
        //toString方法等同于直接输出对象
        System.out.println(p.toString());
        // Java对象可以和字符串进行拼接运算
        System.out.println(p + "");
        System.out.println(p.toString() + "");


    }
}
