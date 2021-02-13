package studyDay7;

/**
 * Apple
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 8:22
 **/
public class Apple extends Fruit{

    /**
     * 子类不会获得父类的构造器， 但是子类构造器可以调用父类构造器代码
     *
     * ps： 子类构造器既没有this调用，也没有super调用，此时会隐式调用父类的无参构造器
     *
     */

    public String color;

    public Apple(String type, String name, String color) {
        super(type, name);
        this.color = color;
    }

    public static void main(String[] args) {
        var a = new Apple("kiki", "jjj", "green");
        System.out.println(a.type + a.name + a.color);
    }
}
