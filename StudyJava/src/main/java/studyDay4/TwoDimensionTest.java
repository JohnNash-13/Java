package studyDay4;

import org.junit.jupiter.api.Test;

/**
 * TwoDimensionTest
 * 二维数组
 * @Author lhq
 * @Version 1.0
 * 2021/2/9 18:13
 **/
public class TwoDimensionTest {

    /**
     * 从Java运行机制而言，并没有多维数组的概念，所有的多维数组都可以看为是一维数组。
     *
     */

    @Test
    public void Test1() {

        //定义二维数组
        int[][] a;
        //把a当成一维数组进行初始化，初始化a是一个长度为4的数组
        //a数组的数组元素又是引用类型
        a = new int[4][];
        for (var i = 0; i < a.length; i ++) {
            System.out.println(a[i]);
        }
        a[0] = new int[2];
        a[0][1] = 6;
        for (var i = 0; i < a[0].length; i ++) {
            System.out.println(a[0][i]);
        }

    }

    @Test
    public void Test2() {

        //同时定义两个维度
        var a = new int[3][4];
        for (var i = 0; i < a.length; i ++) {
            for (var j = 0; j < a[i].length; j ++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        //静态初始化数组
        var str1 = new String[][] { new String[3], new String[] {"hello"}};

        //使用简化的静态初始化数组
        String[][] str2 = {new String[3], new String[] {"hello"}};

        for (var i = 0; i < str1.length; i ++) {
            for (var j = 0; j < str1[i].length; j ++) {
                System.out.print(str1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
