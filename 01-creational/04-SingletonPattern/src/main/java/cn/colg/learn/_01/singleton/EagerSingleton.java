package cn.colg.learn._01.singleton;

/**
 * 单例模式（饿汉式）
 *
 * @author colg
 */
public class EagerSingleton {

    /** 私有静态成员变量，存储唯一实例 */
    public static EagerSingleton instance = new EagerSingleton();

    /** 私有构造函数 */
    private EagerSingleton() {}

    /**
     * 获取唯一实例；类加载时创建单例对象
     *
     * @return
     * @author colg
     */
    public static EagerSingleton getInstance() {
        return instance;
    }
}
