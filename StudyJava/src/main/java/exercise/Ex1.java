package exercise;


/**
 * ex1
 * 使用循环输出等腰三角形
 * @Author lhq
 * @Version 1.0
 * 2021/2/10 8:22
 **/
public class Ex1 {

    public void printIsoscelesTriangle(int row) {
        for (var i = 0; i <= row; i ++) {
            //循环控制输出空格
            for (var k = 0; k < row-i; k++) {
                System.out.print(" ");
            }
            //循环控制输出*
            for (var j = 0; j < 2*i-1; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        var e= new Ex1();
        e.printIsoscelesTriangle(4);
    }
}
