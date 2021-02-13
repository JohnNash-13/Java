package studyDay5;

/**
 * ReturnThis
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/10 12:22
 **/
public class ReturnThis {

    public int age;

    public ReturnThis grow() {
        age ++;
        return this;
    }

    public static void main(String[] args) {
        var rt = new ReturnThis();
        rt.grow().grow().grow();
        System.out.println("rt的成员变量" + rt.age);
    }
}
