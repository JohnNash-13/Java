package studyDay7;

/**
 * HideTest
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 8:11
 **/
public class HideTest {

    public static void main(String[] args) {

        var d = new Derived();

        /**
         * 父类的实例变量并未被完全覆盖，只是简单的被隐藏了而已，通过显式地向上转型后依然可以访问到父类的变量
         */

        System.out.println( ( (Parent) d).tag );
    }
}
