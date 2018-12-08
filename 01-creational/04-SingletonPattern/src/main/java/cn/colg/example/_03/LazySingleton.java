package cn.colg.example._03;

/**
 * 单例模式 - 懒汉式
 *
 * @author colg
 */
public class LazySingleton {

    /**
     * 私有静态成员变量，存储唯一实例
     * 
     * <pre>
     * 如果使用双重检查锁定来实现懒汉式单例类，需要在静态成员变量instance之前增加修饰符volatile，
     * 被volatile修饰的成员变量可以确保多个线程都能够正确处理，且该代码只能在JDK 1.5及以上版本中才能正确执行。
     * </pre>
     */
    private static volatile LazySingleton instance = null;

    /** 私有构造函数 */
    private LazySingleton() {}

    /**
     * 共有静态成员方法，返回唯一实例
     * 
     * <pre>
     * 为了避免多个线程同时调用getInstance()方法，可以在getInstance()前使用关键字synchronized进行线程锁以处理多个线程同时访问的问题。
     * 但是每次调用getInstance()时都需要进行线程锁定判断，在多线程高并发访问环境中，将会导致系统性能大大降低。
     * </pre>
     *
     * @return
     * @author colg
     */
    @Deprecated
    synchronized public static LazySingleton getInstance_01() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 共有静态成员方法，返回唯一实例
     * 
     * <pre>
     * 事实上，无须对整个getInstance()方法进行锁定，只需对其中的代码"instance = new LazySingleton();"进行锁定即可。
     * 
     * 如果线程A和线程B都在调用getInstance()方法，此时instance为null值；
     * 线程A进入synchronized锁定的代码中执行实例创建代码，线程B处于排队等待状态，必须等待线程A执行完毕后才可以进入synchronized锁定代码。
     * 但当A执行完毕时，线程B并不知道实例已经创建，将继续创建新的实例，导致产生多个单例对象，违背单例模式的设计思想
     * </pre>
     *
     * @return
     * @author colg
     */
    public static LazySingleton getInstance_02() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                instance = new LazySingleton();
            }
        }
        return instance;
    }

    /**
     * 共有静态成员方法，返回唯一实例；双重检查锁定
     * 
     * <pre>
     * 在synchronized中再进行一次(instance == null)判断，这种方式称为双重检查锁定(Double-Check Locking)。
     * 由于volatile关键字会屏蔽Java虚拟机所做的一些代码优化，可能会导致系统运行效率降低，因此即使使用双重检查锁定来实现单例模式也不是一种完美的实现方式。
     * </pre>
     *
     * @return
     * @author colg
     */
    public static LazySingleton getInstance() {
        // 第一重判断
        if (instance == null) {
            synchronized (LazySingleton.class) {
                // 第二重判断
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
