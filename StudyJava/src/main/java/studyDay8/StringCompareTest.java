package studyDay8;

/**
 * StringCompareTest
 * JVM常量池管理字符串
 * @Author lhq
 * @Version 1.0
 * 2021/2/17 20:19
 **/
public class StringCompareTest {

    public static void main(String[] args) {

        //常量池数据
        var s1 = "清风朗月花正开";
        var s2 = "清风朗月";
        var s3 = "花正开";

        //能引用常量池
        var s4 = "清风朗月" + "花正开";
        var s5 = "清风" + "朗月" + "花正开";

        //不能引用常量池
        var s6 = s2 + s3;
        var s7 = new String("清风朗月花正开");

        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s7);

        System.out.println("-------------");

        /**
         * equals本质和==并无区别，如果没有重写的话。使用较多的一般都是重写equals方法，因为Java里面只有”值相等“
         */
        System.out.println(s1.equals(s6));
    }


}
