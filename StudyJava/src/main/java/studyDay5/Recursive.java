package studyDay5;

/**
 * Recursive
 * 斐波那契之于递归
 * @Author lhq
 * @Version 1.0
 * 2021/2/10 12:52
 **/
public class Recursive {
    /**
     * 递归:
     * 1. 一个方法调用方法本身
     * 2. 递归一定要向已知方向递归
     * 使用场景： 遍历某个路径所有文件
     */

    /**
     * 对于某个数列：f(0) = 1, f(1) = 4, f(n + 2) = 2 * f(n + 1) + f(n), n>0整数
     */
    public static int fn(int n) {
        if (n == 0) {
            return 1;
        }
        else if(n == 1) {
            return 4;
        }
        else {
            return 2 * fn(n - 1) + fn(n -2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fn(10));
    }
}
