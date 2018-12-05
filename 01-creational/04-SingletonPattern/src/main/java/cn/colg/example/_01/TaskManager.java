package cn.colg.example._01;

import lombok.extern.slf4j.Slf4j;

/**
 * Windows任务管理器
 *
 * @author colg
 */
@Slf4j
public class TaskManager {

    /** 私有静态成员变量，存储唯一实例 */
    private static TaskManager taskManager = null;

    /** 私有化构造方法，禁止使用new创建 */
    private TaskManager() {
        log.info("创建TaskManager");
    }

    /**
     * 获取Windows任务管理器唯一实例
     *
     * @return
     * @author colg
     */
    public static TaskManager getInstance() {
        if (taskManager == null) {
            taskManager = new TaskManager();
        }
        return taskManager;
    }

    public void displayProcesses() {
        log.info("显示进程");
    }

    public void displayServices() {
        log.info("显示服务");
    }

}
