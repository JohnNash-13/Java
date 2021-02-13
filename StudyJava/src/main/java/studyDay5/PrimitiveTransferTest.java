package studyDay5;

/**
 * PrimitiveTransferTest
 * 值传递
 * @Author lhq
 * @Version 1.0
 * 2021/2/10 12:26
 **/
public class PrimitiveTransferTest {

    /**
     * Java里面参数传递方式只有一种：值传递
     * 传入方法的是实际参数值的复制品，参数本身不受任何影响
     * static修饰，属于类本身
     * @param a
     * @param b
     */
    public static void swap(int a, int b) {
        var temp = a;
        a = b;
        b = temp;
        System.out.println("方法里面a的值： " + a + "b的值: " + b);
    }

    public static void main(String[] args) {
        var a = 3;
        var b = 7;
        //两个栈区，一个main，一个swap
        swap(a, b);
        System.out.println("交换结束a的值： " + a + "b的值: " + b);
    }

}
