package cn.colg.example._03;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        AbstractApprover director, manager, vicePresident, president, congress;
        director = new Director("张无忌");
        manager = new Manager("黄蓉");
        vicePresident = new VicePresident("杨过");
        president = new President("郭靖");
        congress = new Congress("董事会");

        // 创建责任链，从小到大顺序
        /*
        director.setSuccessor(manager);
        manager.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        president.setSuccessor(congress);
        */

        // 链式创建责任链
        director.setSuccessor(manager.setSuccessor(vicePresident.setSuccessor(president.setSuccessor(congress))));

        // 创建采购单
        PurchaseRequest pr1, pr2, pr3, pr4;
        pr1 = new PurchaseRequest(45000, 10001, "购买倚天剑");
        pr2 = new PurchaseRequest(60000, 10002, "购买《葵花宝典》");
        pr3 = new PurchaseRequest(160000, 10003, "购买《金刚经》");
        pr4 = new PurchaseRequest(800000, 10004, "购买桃花岛");

        director.processRequest(pr1);
        director.processRequest(pr2);
        director.processRequest(pr3);
        congress.processRequest(pr4);
    }
}
