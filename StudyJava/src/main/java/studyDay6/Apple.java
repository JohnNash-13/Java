package studyDay6;

/**
 * Apple
 * 构造器中的包含关系之this
 * @Author lhq
 * @Version 1.0
 * 2021/2/12 17:56
 **/
public class Apple {

    public String name;
    public String color;
    public double weight;

    public Apple() { };

    public Apple(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Apple(String name, String color, double weight) {
        this(name, color);
        this.weight = weight;
    }

    public static void main(String[] args) {
        var a1 = new Apple("青苹果", "绿色", 18.99);
        System.out.println(a1.name);

    }
}
