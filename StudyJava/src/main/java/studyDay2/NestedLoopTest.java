package studyDay2;

import org.junit.jupiter.api.Test;

/**
 * NestedLoopTest
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/7 19:20
 **/
public class NestedLoopTest {

    /**
     * 嵌套循环实现九九乘法表
     */
    @Test
    public void Test1() {
        for (int i = 1; i < 10; i ++) {
            for (int j = 1; j <= i; j ++) {
                System.out.print(j + " * " + i + " = " + ( i*j ) + "\t");
            }
            System.out.println();
        }
    }
}
