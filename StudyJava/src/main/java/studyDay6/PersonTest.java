package studyDay6;

/**
 * PersonTest
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/12 12:46
 **/
public class PersonTest {

    public static void main(String[] args) {
        System.out.println("Person eyeNum: " + Person.eyeNum);

        var p = new Person();
        System.out.println("Person name: " + p.name + "Person eyeNum: " + p.eyeNum);

        p.name = "孙悟空";
        p.eyeNum = 9;
        System.out.println("Person name: " + p.name + "Person eyeNum: " + p.eyeNum);

        System.out.println("Person eyeNum: " + Person.eyeNum);

        //类变量的作用域较之实例变量大
        /**
         * 类变量从类存在知道类销毁，一直存在
         * 实例变量从类实例到实例销毁，一直存在
         * 同一个类所有实例访问类变量，访问的是同一个类本身变量
         */
        var p2 = new Person();
        System.out.println("p2 eyeNum: " + p2.eyeNum);


    }
}
