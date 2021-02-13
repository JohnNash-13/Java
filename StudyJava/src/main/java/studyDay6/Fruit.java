package studyDay6;

/**
 * Fruit
 * 继承
 * @Author lhq
 * @Version 1.0
 * 2021/2/12 18:01
 **/
public class Fruit {

    /**
     * Java的继承具有单继承的特点，每个子类只有一个直接父类（基类，超类）
     * 关键字： extends 扩展
     * 子类只能从父类中获得成员变量，方法和内部类（包括内部接口，枚举），不能获得构造器和初始化块。
     */

    public double weight;

    public void info(){
        System.out.println("水果" + " 重量 " + weight);
    }

    public void flower() {
        System.out.println("我会开花");
    }


}
