package cn.colg.learn._01;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        AbstractApprover director, manager, generalManager;
        director = new Director().setName("张无忌");
        manager = new Manager().setName("黄蓉");
        generalManager = new GeneralManager().setName("杨过");

        // 创建责任链
        director.setSuccessor(manager.setSuccessor(generalManager));

        // 创建请假条
        Leave leave1, leave2, leave3, leave4;
        leave1 = new Leave("Jack", 2);
        leave2 = new Leave("Rose", 8);
        leave3 = new Leave("Tom", 15);
        leave4 = new Leave("Jax", 50);

        director.processLeave(leave1);
        director.processLeave(leave2);
        director.processLeave(leave3);
        director.processLeave(leave4);
    }
}
