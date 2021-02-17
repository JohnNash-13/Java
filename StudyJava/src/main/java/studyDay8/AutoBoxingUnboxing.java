package studyDay8;

/**
 * AutoBoxingUnboxing
 * 自动装箱 自动拆箱
 * @Author lhq
 * @Version 1.0
 * 2021/2/16 18:22
 **/
public class AutoBoxingUnboxing {

    /**
     * 包装类 与 基本数据类型
     * 除char-> character ， int-> Integer， 其他六个（byte,short,long,float,double,boolean）都是首字母大写即可。
     * 自动装箱： 把一个基本类型变量赋给对应的包装类变量，或者是Object变量
     * 自动拆箱： 把一个包装类对象直接赋给一个对应的基本数据变量
     */

    public static void main(String[] args) {

        //自动装箱
        Integer inObj = 5;
        Object boolObj = true;
        //自动拆箱
        int it =inObj;
        if ( boolObj instanceof Boolean ) {
            boolean b = (Boolean) boolObj;
            System.out.println(b);
        }
    }
}
