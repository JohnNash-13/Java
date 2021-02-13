package studyDay7.reuse;

/**
 * Wolf1
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 11:43
 **/
public class Wolf1{

    private Animal a;

    public Wolf1(Animal a) {
        this.a = a;
    }

    public void breathe() {
        a.breathe();
    }

    public void run() {
        System.out.println("奔跑");
    }
}
