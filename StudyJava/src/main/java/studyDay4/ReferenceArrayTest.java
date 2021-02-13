package studyDay4;

import org.junit.jupiter.api.Test;

/**
 * ReferenceArrayTest
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/9 15:55
 **/
public class ReferenceArrayTest {

    @Test
    public void Test1() {

        // 栈内存中定义了一个students 引用变量
        Person[] students;
        students = new Person[2];
        //栈内存中定义zhangsan 引用变量
        var zhangsan = new Person();
        zhangsan.age = 20;
        zhangsan.height = 192;
        //栈内存中定义Lee 引用变量
        var Lee = new Person();
        Lee.age = 21;
        Lee.height = 100;
        students[0] = zhangsan;
        students[1] = Lee;
        //Lee和student[1]指向同一个内存区(堆内存）
        Lee.info();
        students[1].info();
    }
}
