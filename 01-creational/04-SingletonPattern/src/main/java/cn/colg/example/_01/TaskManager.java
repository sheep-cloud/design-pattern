package cn.colg.example._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 单例 - Windows任务管理器
 * 
 * <pre>
 * 在单例类的内部实现只生成一个实例，同时它提供一个静态的getInstance()工厂方法，让客户可以访问它的唯一实例；
 * 为了防止在外部对其实例化，将其构造函数设计为私有；
 * 在单例类内部定义了一个Singleton类型的静态对象，作为外部共享的唯一实例。
 * </pre>
 *
 * @author colg
 */
@Slf4j
public class TaskManager {

    /** 私有静态成员变量，存储唯一实例 */
    private static TaskManager tm = null;

    /** 私有化构造方法，禁止使用new创建 */
    private TaskManager() {}

    /**
     * 获取Windows任务管理器唯一实例
     *
     * @return
     * @author colg
     */
    public static TaskManager getInstance() {
        if (tm == null) {
            tm = new TaskManager();
        }
        return tm;
    }

    public void displayProcesses() {
        log.info("显示进程");
    }

    public void displayServices() {
        log.info("显示服务");
    }
}
