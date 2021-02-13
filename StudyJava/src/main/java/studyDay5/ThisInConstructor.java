package studyDay5;

/**
 * ThisInConstructor
 * this在构造器中作为默认引用
 * @Author lhq
 * @Version 1.0
 * 2021/2/10 12:20
 **/
public class ThisInConstructor {

    public int foo;

    public ThisInConstructor() {
        int foo;
        this.foo = 6;
    }

    public static void main(String[] args) {
        System.out.println(new ThisInConstructor().foo);
    }
}
