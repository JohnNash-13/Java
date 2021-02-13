package studyDay7.initialization_block;

/**
 * Leaf
 *
 * @Author lhq
 * @Version 1.0
 * 2021/2/13 12:27
 **/
public class Leaf extends Mid{

    static {
        System.out.println("Leaf的类初始化块");
    }

    {
        System.out.println("Leaf的实例初始化块");
    }

    public Leaf() {
        super("JAVA");
        System.out.println("Leaf的构造器");
    }
}
