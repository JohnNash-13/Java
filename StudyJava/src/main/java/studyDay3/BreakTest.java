package studyDay3;

import org.junit.jupiter.api.Test;

/**
 * BreakTest
 * 使用break退出循环
 * @Author lhq
 * @Version 1.0
 * 2021/2/8 14:39
 **/
public class BreakTest {

    /**
     * break 结束循环，开始执行循环后面的代码
     */

    @Test
    public void Test1() {
        for (var i = 0; i < 10; i ++) {
            System.out.println("i: " + i);
            if (i == 4) {
                break;
            }
        }
    }

    /**
     * 使用：标识符结束外层循环
     */
    @Test
    public void Test2() {

        //外层循环，outer作为标识符
        //outer必须在循环前面才起作用
        outer:
        for (var i = 0; i < 5; i ++) {
            for (var j = 0; j < 3; j ++) {
                System.out.println("i : " + i + "j : " + j);
                if (j == 1) {
                    break outer;
                }
            }
        }
    }
}
