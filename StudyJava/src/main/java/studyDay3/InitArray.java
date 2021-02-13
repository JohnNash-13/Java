package studyDay3;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

/**
 * InitArray
 * 数组定义
 * @Author lhq
 * @Version 1.0
 * 2021/2/8 15:01
 **/
public class InitArray {

    /**
     * 静态初始化
     */
    @Test
    public void Test1() {
        int[] intArray;
        intArray = new int[] {1, 2, 3, 4};
        for(int a : intArray) {
            System.out.println("a : " + a);
        }
        Object[] objectArray;
        objectArray = new Object[] {"JAVA", "PYTHON"};
        for (Object o : objectArray) {
            System.out.println("o : "  + o);
        }
        //简化
        int[] intArray2 = {1, 2, 3, 4};
        for (int b : intArray2) {
            System.out.println("b : " + b);
        }

        //使用var 更加简洁
        var books = new Object[] {"语文", "数学"};
        for (Object o1 : books) {
            System.out.println("book : " + o1);
        }

    }

    /**
     * 动态初始化
     * 只能定义数组的长度，由系统给定初始值
     * 整数默认 0 ； 浮点默认 0.0 ； char默认： '\u0000' ；boolean默认 false ；引用类默认 null
     * 不要同时使用静态初始化和动态初始化
     */

    @Test
    public void Test2() {
        int[] prices = new int[5];
        Object[] names = new Object[3];
        for (int a : prices) {
            System.out.println("价格：" + a);
        }
        for (Object o : names) {
            System.out.println("姓名: " + o);
        }

        //var
        var width = new double[3];
        for (double b : width) {
            System.out.println("宽度 ：" + b);
        }

        width[0] = 1.1;
        width[1] = 1.2;

        for (double b : width) {
            System.out.println("宽度 ：" + b);
        }
    }

    /**
     * ps： foreach循环不建议对数组赋值
     */
    @Test
    public void Test4() {
        var books = new Object[] {"语文", "数学", "英语"};
        for (Object o : books) {
            o = "物理";
            System.out.println("o : " + o);
        }
        System.out.println("---------------");
        System.out.println(books[0]);
    }


}
