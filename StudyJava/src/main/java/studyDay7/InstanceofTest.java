package studyDay7;

/**
 * InstanceofTest
 * Instanceof 运算符
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 10:28
 **/
public class InstanceofTest {

    /**
     * Instanceof 运算符前一个操作数通常是引用类型变量，后一个是类（接口）
     * @param args
     */


    public static void main(String[] args) {

        Object o = "Hello";
        System.out.println("字符串是否是Object类的实例:" +
                            ( o instanceof Object ) );
        System.out.println("字符串是否是String类的实例：" +
                            ( o instanceof String) );
        System.out.println("字符串是否是Math类的实例：" +
                            ( o instanceof Math ) );
        // String实现了Comparable接口
        System.out.println("字符串是否是Comparable接口的实例：" +
                            ( o instanceof Comparable) );
        var a = "hello";
        //System.out.println("字符串是否是Math类的实例：" +( a instanceof Math ) );
    }
}
