package studayDay1;

/**
 * Data
 * 基本数据类型
 * @Author lhq
 * @Version 1.0
 * 2021/2/5 14:32
 **/
public class Data {
    /**
     * 数据类型分类
     * 首先 Java -- 强类型语言：1.变量必须先声明后使用；2.指定类型变量只能接收匹配的值。
     * Java数据类型分为两大类：基本数据类型（Primitive Type）和引用数据类(Reference Type)
     * 基本数据类型又分为boolean和数值类型，数值类型则分为整数类型（int，short，long，char）和浮点类型（float，double）。
     * 引用数据类型则包括类，数组，接口以及特殊的null类型。本质就是一个指针，只不过Java中没有指针的说法
     * byte: 1字节； short：2字节； int:4字节； long：8字节；
     * char：2字节； float：4字节； double：8字节； boolean：
     */

    public static void main(String[] args) {
        int a = 12;
        System.out.println(a);
        byte b = 56;
        System.out.println(b);
        long bigValue = 999999999999L;
        System.out.println(bigValue);

        //整数值有四种表示方式：十进制，八进制，二进制，十六进制
        //二进制--0b/0B开头
        int binaryValue = 0b1;
        System.out.println(binaryValue);
        //八进制--0开头
        int octalValue = 013;
        System.out.println(octalValue);
        //十进制--正常输出
        int decimalValue = 123;
        System.out.println(decimalValue);

        //十六进制--0x或0X开头
        int hexadecimalValue = 0x123;
        System.out.println(decimalValue);

        //字符型三种类型-- 1. 单字符 'A'； 2. 转义字符 '\n' 3. Unicode
        char charA = 'A';
        char charB = '\n';
        char charC = '\u9999';
        System.out.println( "dsa:" + charA + charB + charC );

        char charD = '项';
        int xiangValue = charD;
        System.out.println("项：" + xiangValue);
    }
}
