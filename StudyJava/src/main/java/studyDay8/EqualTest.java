package studyDay8;

/**
 * EqualTest
 * equals 和 == 方法
 * @Author lhq
 * @Version 1.0
 * 2021/2/17 17:05
 **/
public class EqualTest {

    /**
     * == : 它的作⽤是判断两个对象的地址是不是相等。即，判断两个对象是不是同⼀个对象(基本数据类型
     * 比较的是值，引⽤数据类型比较的是内存地址)
     *
     */

    public static void main(String[] args) {

        // ==: 如果两个变量是基本类型变量，且都是数值类型，值相等即true
        var it = 65;
        var fl = 65.0f;
        System.out.println("65和65.0f是否相等" + ( it == fl ));
        var ch = 'A';
        System.out.println("65和'A'是否相等" + ( 65 == ch ));

        // 如果是两个直接量"hello" 则==返回true,此时在常量池管理
        // 如果是new，JVM首先在常量池管理，然后通过String的构造器创建一个新的String对象，保存在堆内存中，（产生了两个字符串变量）,返回false
        var str1 = new String("hello");
        var str2 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

}
