package studyDay7.initialization_block;

/**
 * StaticInitTest
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 12:35
 **/
public class StaticInitTest {

    static {
        a = 6;
    }

    static int a = 0;

    public static void main(String[] args) {

        System.out.println(StaticInitTest.a);
    }
}
