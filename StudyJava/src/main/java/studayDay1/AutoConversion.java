package studayDay1;

/**
 * AutoConversion
 * 自动类型转换
 * @Author lhq
 * @Version 1.0
 * 2021/2/6 13:58
 **/
public class AutoConversion {

    /**
     *
     * 1. char->int->long->float->double
     * 2. byte->short->int->long-float->double
     *
     * 原则：
     * 1. 小类型转换成大类型：自动类型转换即可
     * 2. 大类型转换成小类型，需要强制转换
     *
     * @param args
     */

    public static void main(String[] args) {
        int a = 6;
        float b = a;
        System.out.println( a + " " + b);

        byte c = 9;
        //char d = c; 报错
        double d = c;
        System.out.println( c + " " + d);

        double e = 11.0;
        int f = (int)e;
        System.out.println( e + " " + f);
    }
}
