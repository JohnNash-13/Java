package studyDay3;

import org.junit.jupiter.api.Test;

/**
 * Return
 * return 直接结束整个方法
 * @Author lhq
 * @Version 1.0
 * 2021/2/8 14:53
 **/
public class ReturnTest {

    @Test
    public void Test1() {
        for (var i = 0; i < 5; i ++) {
            System.out.println("i : " + i);
            if (i == 2) {
                return;
            }
        }
    }
}
