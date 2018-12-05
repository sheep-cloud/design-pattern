package cn.colg.example._04;

/**
 * 单例模式 - Initialization on Demand Holder （IoDH）
 *
 * @author colg
 */
public class IoDHSingleton {

    /** 私有构造函数 */
    private IoDHSingleton() {}

    /**
     * 通过静态内部类持有唯一实例，由Java虚拟机来保证其线程安全性。
     *
     * @author colg
     */
    private static class HolderClass {
        private static IoDHSingleton instance = new IoDHSingleton();
    }

    /**
     * 获取唯一实例，调用时创建单例对象
     *
     * @return
     * @author colg
     */
    public static IoDHSingleton getInstance() {
        return HolderClass.instance;
    }
}
