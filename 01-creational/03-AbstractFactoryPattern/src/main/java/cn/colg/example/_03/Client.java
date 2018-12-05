package cn.colg.example._03;

import cn.colg.util.IniUtil;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory;
        factory = (AbstractFactory)IniUtil.getBean("example._03");
        factory.createProductA();
        factory.createProductB();
    }
}
