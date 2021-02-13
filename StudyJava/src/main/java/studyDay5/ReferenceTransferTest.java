package studyDay5;

/**
 * ReferenceTransferTest
 * 引用类型值传递
 * @Author lhq
 * @Version 1.0
 * 2021/2/10 12:38
 **/
public class ReferenceTransferTest {

    public static void swap(DataWrap d) {
        var temp = d.a;
        d.a = d.b;
        d.b = temp;
        System.out.println("方法里面a的值： " + d.a + "b的值： " + d.b);
        d = null;
    }

    public static void main(String[] args) {
        var dw = new DataWrap();
        dw.a = 3;
        dw.b = 7;
        //两个栈区，一个main，一个swap，
        //复制过去的仅仅是一个dw引用变量，副本实际指向的依旧是堆内存中的实际对象
        swap(dw);
        System.out.println("交换后a的值: " + dw.a + "b的值：" + dw.b);
    }
}
