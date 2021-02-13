package studyDay2;

import org.junit.jupiter.api.Test;

/**
 * IfErrorTest
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/7 18:51
 **/
public class IfErrorTest {

    /**
     * 对于if-else 语句
     * 一定要先处理范围小的情况
     */

    @Test
    public void Test1() {
        var age = 45;
        if(age > 20) {
            System.out.println("青年人");
        }
        else if(age > 40) {
            System.out.println("中年人");
        }
        else if(age > 60) {
            System.out.println("老年人");
        }

    }

    @Test
    public void Test2() {
        var age = 45;
        if(age > 60) {
            System.out.println("青年人");
        }
        else if(age > 40) {
            System.out.println("中年人");
        }
        else if(age > 20) {
            System.out.println("老年人");
        }

    }

    @Test
    public void Test3() {
        var age = 45;
        if(age > 20 && age < 40) {
            System.out.println("青年人");
        }
        else if(age > 40 && age < 60) {
            System.out.println("中年人");
        }
        else if(age > 60) {
            System.out.println("老年人");
        }

    }
}
