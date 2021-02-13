package Utils;

/**
 * RandomStrUtil
 * 6位随机字符串
 * @Author lhq
 * @Version 1.0
 * 2021/2/6 14:05
 **/
public class RandomStrUtil {

    public static void main(String[] args) {
        //定义空字符串
        var result = "";
        //控制验证码位数
        for (var i = 0; i < 6; i ++) {
            var intVal = (int) (Math.random() * 26 + 97);
            result = result + (char) intVal;
        }
        System.out.println(result);
    }
}
