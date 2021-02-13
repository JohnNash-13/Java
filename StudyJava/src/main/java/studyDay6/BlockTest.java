package studyDay6;

/**
 * BlockTest
 * 局部变量
 * @Author lhq
 * @Version 1.0
 * 2021/2/12 12:57
 **/
public class BlockTest {

    /**
     * 局部变量
     * 局部变量分为形参，方法局部变量，代码块局部变量
     * 除形参外，都必须初始化，形参的值由方法的调用者指定
     */

    public static void main(String[] args) {
        int a;
        //报错
        //System.out.println(a);
        a = 5;
        System.out.println(a);
    }

}
