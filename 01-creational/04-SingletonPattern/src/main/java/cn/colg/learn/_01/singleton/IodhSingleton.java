package cn.colg.learn._01.singleton;

/**
 * 单例模式（IoDH技术）
 *
 * @author colg
 */
public class IodhSingleton {

    /** 私有构造函数 */
    private IodhSingleton() {}

    /**
     * 通过静态内部类持有唯一实例，由Java虚拟机来保证其线程安全性。
     *
     * @author colg
     */
    private static class HolderClass {
        private static IodhSingleton instance = new IodhSingleton();
    }

    /**
     * 获取唯一实例，调用时创建单例对象
     *
     * @return
     * @author colg
     */
    public static IodhSingleton getInstance() {
        return HolderClass.instance;
    }
}
