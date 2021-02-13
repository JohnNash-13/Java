package studyDay7;

/**
 * ConversionTest
 * 引用变量的强制类型转换
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 10:04
 **/
public class ConversionTest {
    /**
     * 1. char->int->long->float->double 大
     * 2. byte->short->int->long-float->double 大
     * @param args
     */

    public static void main(String[] args) {

        var d = 3.14;
        var l = (long)d;
        System.out.println(l);

        int a = 2;
        long l1 = a;
        System.out.println(l1);

        Object o1 = "Hello";
        var o1Str = (String)o1;
        System.out.println(o1Str);

        Object objPri = Integer.valueOf(5);

        //ClassCastException
        //var str = (String)objPri;
        //System.out.println(str);

        /**
         * instanceof 判断是否可以成功转换
         */
        if( objPri instanceof String) {
            var str = (String)objPri;
            System.out.println(str);
        }

    }
}
