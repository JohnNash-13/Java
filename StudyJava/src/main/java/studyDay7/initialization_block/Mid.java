package studyDay7.initialization_block;

/**
 * Mid
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 12:21
 **/
public class Mid extends Root{

    static {
        System.out.println("Mid的类初始化块");
    }

    {
        System.out.println("Mid的实例初始化块");
    }

    public Mid() {
        System.out.println("Mid的无参构造器");
    }

    public Mid(String msg) {
        this();
        System.out.println("Mid的带一个参数的构造器，参数值：" + msg);
    }

}
