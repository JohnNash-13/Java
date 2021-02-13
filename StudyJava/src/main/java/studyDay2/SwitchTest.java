package studyDay2;

import org.junit.jupiter.api.Test;

/**
 * SwitchTest
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/7 18:56
 **/
public class SwitchTest {

    /**
     * Switch注意：
     * 1. case后面的break不能忽视，否则将引入一个陷阱，除非遇到break；
     * 2. switch的表达式支持类型为 ： byte, short, char, int,
     *                            Java7: String(不能是StringBuffer和StringBuild)，枚举
     */

    @Test
    public void Test1() {
        var grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("中等");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("不及格");
                break;
            default:
                System.out.println("成绩输入错误");
        }
    }

    @Test
    public void Test2() {
        var grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("优秀");
            case 'B':
                System.out.println("中等");
            case 'C':
                System.out.println("及格");
            case 'D':
                System.out.println("不及格");
            default:
                System.out.println("成绩输入错误");
        }
    }

    @Test
    public void Test3() {
        var season = "秋天";

        switch (season) {
            case "春天":
                System.out.println("春天");
                break;
            case "夏天":
                System.out.println("夏天");
                break;
            case "秋天":
                System.out.println("秋天");
                break;
            case "冬天":
                System.out.println("冬天");
                break;
            default:
                System.out.println("季节输入错误");
        }
    }
}
