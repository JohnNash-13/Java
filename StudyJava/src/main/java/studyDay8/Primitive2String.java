package studyDay8;

import java.util.Locale;

/**
 * Primitive2String
 * 基本数据类型变量和字符串之间的转换
 * @Author lhq
 * @Version 1.0
 * 2021/2/16 18:30
 **/
public class Primitive2String {

    public static void main(String[] args) {

        var intStr = "123";
        // 1. 利用包装类提供的 parseXxx(String s)静态方法(除 Character以外所有包装类都使用)
        var it1 = Integer.parseInt(intStr);
        System.out.println(it1);
        // 2. 利用包装类的valueOf(String s)静态方法
        var it2 = Integer.valueOf(it1);
        System.out.println(it2);

        System.out.println("----------");
        var floatStr = "3.14";
        var ft1 = Float.parseFloat(floatStr);
        var ft2 = Float.valueOf(floatStr);
        System.out.println(ft1);
        System.out.println(ft2);

        System.out.println("----------");
        var ftStr = String.valueOf(3.145f);
        System.out.println(ftStr);

        System.out.println("----------");
        var boolStr = String.valueOf(true);
        System.out.println(boolStr.toUpperCase(Locale.ROOT));

        System.out.println("----------");
        // 最最简便的将其他基本类型变量转化成字符串变量 + "";

        var itStr = 5 + "";
        System.out.println(itStr);

        System.out.println("----------");
        //包装类实例可以和基本类型变量作比较，因为所比较的是所包装的数值
        var a = Integer.valueOf(6);
        System.out.println("6的包装类实例是否大于5" + ( a > 5.0) );

        System.out.println("----------");
        //两个包装类实例的比较则需引用指向同一个对象
        System.out.println("比较两个4的包装类实例是否相等" + ( Integer.valueOf(4) == Integer.valueOf(4)) );

        //ps: 自动装箱Integer实例，-128-127之间(cache 数组)

        System.out.println("----------");
        //包装类的 compare(xxx val1, xxx val2 )方法比较两个基本类型的大小
        System.out.println(Boolean.compare(true, false));
        System.out.println(Boolean.compare(true, true));
        System.out.println(Boolean.compare(false, true));

    }

}
