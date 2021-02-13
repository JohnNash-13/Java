package studyDay2;

import org.junit.jupiter.api.Test;

/**
 * WhileTest
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/7 19:14
 **/
public class WhileTest {

    /**
     * while:
     *
     */

    @Test
    public void Test1() {
        var count = 0;

        while (count < 10) {
            System.out.println(count);
            count ++;
        }
    }

    @Test
    public void Test2() {
        var count = 20;

        do {
            count ++;
        }while (count < 10);
        System.out.println("循环结束");

        //21
        System.out.println(count);
    }
}
