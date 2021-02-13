package studyDay6;

/**
 * ConstructorOverload
 * 构造器重载
 * @Author lhq
 * @Version 1.0
 * 2021/2/12 17:46
 **/
public class ConstructorOverload {

    public String name;
    public int age;

    public ConstructorOverload() { };

    public ConstructorOverload(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        var co = new ConstructorOverload();
        var co1 = new ConstructorOverload("kiki", 220);
        System.out.println(co.name + " " + co.age);
        System.out.println(co1.name + " " + co1.age);
    }
}
