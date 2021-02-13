package studyDay4;

import org.junit.jupiter.api.Test;

/**
 * ArrayInRam
 * 理解引用变量和数组对象
 * @Author lhq
 * @Version 1.0
 * 2021/2/9 14:59
 **/
public class ArrayInRam {

    @Test
    public void Test1() {
        var a = new int[] {1, 2, 3};
        var b = new int[4];
        //此时，四块内存区
        //两个引用变量a，b ； 两个人数组本身a和b
        System.out.println("b：" + b.length);
        for (int temp: a) {
            System.out.println(temp);
        }
        for (int temp: b) {
            System.out.println(temp);
        }

        b = a;

        System.out.println("b: " + b.length);
    }

}
