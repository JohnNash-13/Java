package studyDay7.test;

/**
 * Animal
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 8:30
 **/
public class Animal extends Creature{

    public Animal(String name) {
        System.out.println("Animal 带一个参数的构造器" + "动物名字：" + name);
    }

    public Animal(String name, int age) {
        this(name);
        System.out.println("Animal 带两个参数的构造器 " + "动物名字：" + name + "动物年龄：" + age);
    }
}
