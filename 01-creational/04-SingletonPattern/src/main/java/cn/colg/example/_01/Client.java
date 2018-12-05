package cn.colg.example._01;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        TaskManager taskManager = TaskManager.getInstance();
        taskManager.displayProcesses();
        taskManager.displayServices();
    }
}
