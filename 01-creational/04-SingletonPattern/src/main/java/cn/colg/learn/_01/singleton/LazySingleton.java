package cn.colg.learn._01.singleton;

/**
 * 单例模式（懒汉式，带双重检查锁定）
 *
 * @author colg
 */
public class LazySingleton {

    /** 私有静态变量，存储唯一实例 */
    private static volatile LazySingleton instance = null;

    /** 私有构造函数 */
    private LazySingleton() {}

    /**
     * 获取唯一实例，调用时创建单例对象
     *
     * @return
     * @author colg
     */
    public static LazySingleton getInstance() {
        // 双重检查
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
