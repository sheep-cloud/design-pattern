package cn.colg.example._03;

/**
 * 单例模式 - 饿汉式
 *
 * @author colg
 */
public class EagerSingleton {

    /**
     * 私有静态成员变量，存储唯一实例
     * 
     * <pre>定义静态变量的时候实例化单例类，因此在类加载的时候就已经创建了单例对象</pre>
     */
    private static EagerSingleton instance = new EagerSingleton();

    /** 私有构造函数 */
    private EagerSingleton() {}

    /**
     * 共有静态成员方法，返回唯一实例
     *
     * @return
     * @author colg
     */
    public static EagerSingleton getInstance() {
        return instance;
    }

}
