package studyDay9;

import org.junit.jupiter.api.Test;

/**
 * FinalReplaceTest
 *
 * @Author lhq
 * @Version 1.0
 * 2021/4/7 17:14
 **/
public class FinalReplaceTest {
    /**
     * 如果被赋的不是变量而是表达式或字符串连接运算，没有调用方法，也会当成宏变量处理。
     */

    public static void main(String[] args) {

        final int a = 1 + 9;
        final double b = 3.14 + 4.13;
        final String str1 = "kiki" + "XJQ";
        final String str2 = "kiki" + "XJQ" + 99.0;

        final String str3 = "kikiXJQ" + String.valueOf(99.0);

        System.out.println(str2 == "kikiXJQ99.0");
        System.out.println(str3 == "kikiXJQ99.0");

    }

    @Test
    public void StringJoinTest() {

        String str1 = "Java学习";
        String str2 = "Java" + "学习";

        System.out.println(str1 = str2);


    }
}
