package exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * ex2
 * 实现一个按字节来截取字符串子串的方法，英文符1字节，中文2字节，
 * @Author lhq
 * @Version 1.0
 * 2021/2/10 8:35
 **/
public class Ex2 {

    /**
     * subString
     * @param s 字符串
     * @param fromByte 起始字节
     * @param toByte 结束字节
     * @return subString
     */
    public String subString(String s, int fromByte, int toByte){
        //提取String字符串中的每一个字符，用String类成员函数：charAt(i)
        //字符串总的字节数
        List<Character> charArr = new ArrayList<Character>();
        List<Integer> byteArr = new ArrayList<Integer>();
        var temp = 0;
        for (var i = 0; i < s.length(); i ++) {
            charArr.add( s.charAt(i) );
            var flag = 0;
            if ( (int)s.charAt(i) > 127 ) {
                flag = 2;
            }else {
                flag = 1;
            }
            temp += flag;
            byteArr.add( temp );
        }

        var subString = "";

        //indexOf -> 获取索引  get--> 获取值
        var finalIndex = byteArr.contains(toByte) ? byteArr.indexOf(toByte) : byteArr.indexOf(toByte) - 1;
        for (var i = byteArr.contains(fromByte) ? byteArr.indexOf(fromByte) : byteArr.indexOf(fromByte) - 1; i <= finalIndex; i ++) {
            subString += charArr.get(i);
        }

        return subString;
    }

    public static void main(String[] args) {
        var e = new Ex2();
        System.out.println(e.subString("abcdefg斤斤计较", 3, 6));
    }
}
