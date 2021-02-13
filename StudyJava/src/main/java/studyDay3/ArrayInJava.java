package studyDay3;

import org.junit.jupiter.api.Test;

/**
 * ArrayInJava
 * 深入数组
 * @Author lhq
 * @Version 1.0
 * 2021/2/8 21:28
 **/
public class ArrayInJava {


    /**
     * 堆内存与栈内存
     * 栈内存（Stack）： 每个方法都会都会建立自己的内存栈（栈内存），每个定义的局部变量都存在栈内存里面；
     * 堆内存 (Head)： 在程序中创建的对象，会保存在运行时数据区中，即堆内存；堆内存不会随着方法的结束而销毁，只有当一个对象没有任何引用变量去引用时，垃圾回收。
     * eg: var nums = new int[] {1,2,3,4}
     *     根本方式：   num[0]是数组变量(引用变量) ------->  1,2,3,4则是数组元素
     *
     */
    @Test
    public void Test1() {

    }
}
