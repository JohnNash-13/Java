package studyDay3;

import org.junit.jupiter.api.Test;

/**
 * ContinueTest
 * continue忽略本次循环剩下语句
 * @Author lhq
 * @Version 1.0
 * 2021/2/8 14:46
 **/
public class ContinueTest {

    /**
     * continue 区别于 break: 仅仅忽略本次循环的剩余语句，开始新的循环
     */
    @Test
    public void Test1() {
        for (var i = 0; i < 5; i ++) {
            System.out.println("i : " + i);
            if (i == 2) {
                continue;
            }
            System.out.println("continue 剩余语句");
        }
    }

    /**
     * 同样借助outer标识符忽略本次大循环
     */

    @Test
    public void Test2() {


        /**
         * 由于内层循环也相当于外层循环里面的语句，故忽略，永远无j>1以后的
         */
        outer:
        for (var i = 0; i < 3; i ++) {
            for (var j = 0; j < 3; j ++) {
                System.out.println("i : " + i + "j : " + j);
                if (j == 1) {
                    continue outer;
                }
            }
        }
    }

}
