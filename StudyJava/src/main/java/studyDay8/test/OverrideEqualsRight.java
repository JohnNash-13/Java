package studyDay8.test;

/**
 * OverrideEqualsRight
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/17 21:02
 **/
public class OverrideEqualsRight {

    /**
     * equals()方法五大特性：
     * 1. 自反性
     * 2. 对称性
     * 3. 传递性
     * 4. 一致性
     * 5. 对任何不是null的x，x.equals(null) 一定返回false
     *
     * equals()默认比较的是对象的地址，与==完全一致
     *
     */

    public static void main(String[] args) {
        var a1 = new Animal("麻雀", "鸟");
        var a2 = new Animal("喜鹊", "鸟");
        var a3 = new Animal("狼", "陆生动物");

        System.out.println(a1.equals(a2));
        System.out.println(a2.equals(a3));
    }
}
