package studyDay8;

/**
 * UnsignedTest
 * 无符号整数: 最高位不再是符号位，不支持负数，最小值是0
 * @Author lhq
 * @Version 1.0
 * 2021/2/17 16:44
 **/
public class UnsignedTest {

    public static void main(String[] args) {

        /**
         * Byte, Short的 toUnsignedInt(xxx x), toUnsignedLong(yyy y) 可以转换为对应的无符号的int或long
         */
        byte b = -3;
        System.out.println(Byte.toUnsignedInt(b));

        //指定十六进制解析无符号整数
        var val = Integer.parseUnsignedInt("ab", 16);
        System.out.println(val);

        //将-12化为无符号整数，然后转化为十六进制的字符串
        System.out.println(Integer.toUnsignedString(-12, 16));

        //将两个数化为无符号整数然后相除
        System.out.println(Integer.divideUnsigned(-2, 3));

        //将两个数化为无符号整数然后相除后取余
        System.out.println(Integer.remainderUnsigned(-2, 7));
    }
}
