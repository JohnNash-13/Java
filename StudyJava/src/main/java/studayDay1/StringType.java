package studayDay1;

/**
 * StringType
 * 直接量-String
 * @Author lhq
 * @Version 1.0
 * 2021/2/6 18:15
 **/
public class StringType {
    /**
     * 直接量之String
     * 当程序第一次使用时，Java使用常量池（constant pool）来缓存
     * 并且String 是不可变类，所以创建出来不会被改变 --> final
     */

    public static void main(String[] args) {

        /**
         * 常量池：指的是在编译器被确定，保存在.class文件中的数据（类，方法，接口中的常量）
         */

        var s0 = "hello";
        var s1 = "hello";
        var s2 = "he" + "llo";
        System.out.println(s0 == s1);
        System.out.println(s0 == s2);
    }
}
