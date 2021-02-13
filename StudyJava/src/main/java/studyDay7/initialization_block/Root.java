package studyDay7.initialization_block;

/**
 * Root
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 12:19
 **/
public class Root {

    static {
        System.out.println("Root的类初始化块");
    }

    {
        System.out.println("Root的实例初始化块");
    }

    public Root() {
        System.out.println("Root的无参构造器");
    }
}
