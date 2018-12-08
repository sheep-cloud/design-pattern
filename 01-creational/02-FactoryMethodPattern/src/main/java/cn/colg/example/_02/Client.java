package cn.colg.example._02;

import cn.colg.util.IniUtil;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args){
        Factory factory = (Factory)IniUtil.getBean("example._02");
        Product product = factory.factoryMethod();
        product.methodDiff();
    }
}
