package studyDay9;

import org.junit.jupiter.api.Test;

/**
 * FinalLocalTest
 * 可执行宏替换的final
 * @Author lhq
 * @Version 1.0
 * 2021/4/7 17:09
 **/
public class FinalLocalTest {
    /**
     * final变量满足三条件即为”宏变量“（直接量）：
     * 1. final修饰
     * 2. 定义时指定初始值
     * 3. 在编译阶段确定
     */

    @Test
    public void test1() {
        final int a = 5;
        //a 等价于下面语句
        System.out.println(a);
    }



}
