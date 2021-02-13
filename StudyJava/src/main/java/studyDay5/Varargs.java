package studyDay5;

/**
 * Varargs
 * 个数可变形参
 * @Author lhq
 * @Version 1.0
 * 2021/2/10 12:45
 **/
public class Varargs {
    /**
     * 1. 个数可变形参只能位于形参列表最后
     * 2. 一个方法只能有一个可变形参
     * 3. 个数可变形参本质就是一个数组类型形参
     */

    public static void test(int a, String... books) {
        for (var temp : books) {
            System.out.println(temp);
        }
        System.out.println(a);
    }

    public static void test2(int a, String[] books) {
        for (var temp : books) {
            System.out.println(temp);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {

        //个数可变形参传参更为简洁
        test(3,"JAVA", "PYTHON", "C");
        //必须传给形参一个数组
        test2(3, new String[] {"AAA", "BBB", "C"});
    }

}
