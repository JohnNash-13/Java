package studyDay7.test;

/**
 * WOLF
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 8:33
 **/
public class Wolf extends Animal{

    public Wolf() {
        super("灰太狼",3);
        System.out.println("Wolf 无参构造器");
    }

    public static void main(String[] args) {
        var w = new Wolf();

    }
}
