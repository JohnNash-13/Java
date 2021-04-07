package studyDay9;

import java.util.Arrays;

/**
 * FinalReferenceTest
 * final 修饰基本数据类型和引用数据类型区别
 * @Author lhq
 * @Version 1.0
 * 2021/4/7 16:34
 **/
public class FinalReferenceTest {

    public static void main(String[] args) {

        final int[] iArr = {1, 2, 4, 3, 5};
        System.out.println(Arrays.toString(iArr));
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));
        iArr[2] = 9;
        System.out.println(Arrays.toString(iArr));
        // 注意： final修饰的基本数据类型不能再次赋值
        final Person person = new Person(47);
        System.out.println(person.getAge());
        person.setAge(14);
        System.out.println(person.getAge());
        // 注意： final修饰的引用数据类型也不能重新赋值，但是对于其成员变量可以，因为final只是保证该引用地址不改变。

    }
}
