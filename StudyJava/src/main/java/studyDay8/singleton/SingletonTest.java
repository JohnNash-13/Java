package studyDay8.singleton;

/**
 * SingletonTest
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/17 21:22
 **/
public class SingletonTest {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        //true
        System.out.println(s1.equals(s2));

        //studyDay8.singleton.Singleton@27bc2616
        //studyDay8.singleton.Singleton@27bc2616
        System.out.println(s1);
        System.out.println(s2);
    }

}
