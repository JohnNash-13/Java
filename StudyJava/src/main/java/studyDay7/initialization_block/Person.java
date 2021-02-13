package studyDay7.initialization_block;

/**
 * Person
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 12:01
 **/
public class Person {

    /**
     * 初始化块的执行先于构造器
     * 实例初始化块只在创建Java对象的时候隐式执行且在构造器之前自动执行，类初始化则在类初始化阶段自动执行
     */

    {
        var a = 6;
        if ( a > 4 ) {
            System.out.println("Person的第一个实例初始化块：局部变量a的值大于4" );
        }else {
            System.out.println("Person的第一个实例初始化块");
        }
    }

    {
        System.out.println("Person的第二个实例初始化块");
    }

    public Person() {
        System.out.println("Person的无参构造器");
    }

    public static void main(String[] args) {
        var p = new Person();
    }
}
