package studyDay7.reuse;

/**
 * Bird1
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 11:41
 **/
public class Bird1{

    //将原来的父类（旧类）组合到原来的子类（新类），作为子类的一部分，用private修饰。
    private Animal a;

    public Bird1(Animal a) {
        this.a = a;
    }

    public void breathe() {
        a.breathe();
    }

    public void fly() {
        System.out.println("飞翔");
    }
}
