package cn.colg.example._02;

import cn.colg.util.IniUtil;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Factory factory;
        // factory = new ConcreteFactory();
        
        String factoryName = IniUtil.getStr("example._02");
        factory = (Factory)Class.forName(factoryName).newInstance();

        Product product;
        product = factory.factoryMethod();
        product.methodDiff();
    }
}
