package Utils;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

/**
 * ArraysTest
 * 操作数组工具类 Arrays
 * @Author lhq
 * @Version 1.0
 * 2021/2/9 18:31
 **/
public class ArraysTest {


    /**
     * Java 8 以前包含的一些static修饰的Arrays方法（static修饰的方法可以直接通过类名调用）
     */
    @Test
    public void Test1() {

        /**
         * 1. int binarySearch(type[] a, type key)
         * 使用二分法查询key元素值在a中出现的索引，但是该数组必须是升序排列
         * 不包含则返回负数
         */
        var a = new int[] {1,3,5,7};
        System.out.println("binarySearch方法: " + Arrays.binarySearch(a, 3));

        /**
         * 2. int binarySearch(type[] a, int fromIndex, int toIndex, type key)
         * 使用与之类似，只不过查询的是fromIndex到toIndex之间的元素
         */
        System.out.println("binarySearch方法：" + Arrays.binarySearch(a, 1, 3, 0));

        /**
         * 3. type[] copyOf(type[] original, int length)
         * 将original数组复制成一个新数组，length是新数组的长度
         * 不够补0，false，null，够则填original数组元素
         */
        var b = Arrays.copyOf(a, 5);
        System.out.println("copyOf方法： ");
        for (var temp : b) {
            System.out.print(temp + " ");
        }
        System.out.println();

        /**
         * 4. type[] copyOf(type[] original, int from, int to)
         * 和前面相似
         */

        /**
         * 5. boolean equals(type[] a, type[] a2)
         * 如果a和a1数组长度相等，且数组元素一一相等，返回true
         */
        System.out.println("equals方法： " + Arrays.equals(a, b));

        /**
         * 6. void fill(type[] a, type val)
         *    void fill(type[] a, int fromIndex, int toIndex, type val)
         * 将数组指定元素都赋值为 val
         */
        Arrays.fill(a, 99);
        System.out.println("fill方法: ");
        for (var temp : a) {
            System.out.print(temp + " ");
        }
        System.out.println();

        /**
         * 7. void sort(type[] a)
         *    void sort(type[] a, int fromIndex, int toIndex)
         * 将数组指定元素进行排序
         */
        var c = new int[] {3, 4, 1, 0, 8};
        Arrays.sort(c);
        System.out.println("sort方法: " );
        for (var temp : c) {
            System.out.print(temp + " ");
        }
        System.out.println();

        /**
         * 8. String toString(type[] a)
         * 将一个数组转换成字符串，元素之间用，或者空格隔开
         */
        System.out.println("toString方法: " + Arrays.toString(c));
    }

    /**
     * java 8 以后增加的方法, 主要是并发支持
     */
    @Test
    public void Test2() {
        var arr1 = new int[] {3, -4, 25, 16, 30, 18};
        // 对数组arr1进行并发排序 -30ms
        Arrays.parallelSort(arr1);
        System.out.println(Arrays.toString(arr1));

        var arr2 = new int[] {3, -4, 25, 16, 30, 18};
        Arrays.parallelPrefix(arr2, new IntBinaryOperator() {
            /**
             * 匿名内部类
             * 新数组的第一个元素总是等于原数组的第一个元素
             * @param left ： 代表数组中前一个索引处的元素
             * @param right ： 代表原数组中当前索引处的元素
             * @return
             */
            @Override
            public int applyAsInt(int left, int right) {
                System.out.println("left : " + left + "right : " + right);
                return left * right;
            }
        });
        /**
         * 3 -4 25 16 30 18
         * 3 -12 .........
         */
        System.out.println(Arrays.toString(arr2));

        var arr3 = new int[5];
        Arrays.parallelSetAll(arr3, new IntUnaryOperator() {
            /**
             *
             * @param operand ：代表正在计算的元素索引
             * @return
             */
            @Override
            public int applyAsInt(int operand) {
                return operand * 5;
            }
        });

        System.out.println(Arrays.toString(arr3));
    }
}
