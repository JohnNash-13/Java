package studyDay8.singleton;

/**
 * Singleton
 * 单例类
 * 实例： 一个窗口管理器，一个假脱机打印设备，或者一个数据库引擎访问点
 * @Author lhq
 * @Version 1.0
 * 2021/2/17 21:16
 **/
class Singleton {

    // public 修饰构造器的话 允许任何类自由创建该类的对象，有时可能毫无意义反而降低了系统性能的下降
    // 因此
    // 1. 暴露一个用static修饰的方法用于访问和创建该类的对象；
    // 2. 用一个static修饰的类变量去缓存已经创建的对象，保证只创建了一个对象;
    // 3. 用 private修饰构造器，将构造器隐藏.


    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
