package studyDay7.reuse;

/**
 * Animal
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 11:33
 **/
public class Animal {

    private void beat() {
        System.out.println("心脏跳动");
    }

    public void breathe() {
        beat();
        System.out.println("吸一口气，呼一口气。");
    }
}
