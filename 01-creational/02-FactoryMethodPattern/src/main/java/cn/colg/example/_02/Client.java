package cn.colg.example._02;

import cn.hutool.setting.dialect.Props;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Factory factory;
        
        /*factory = new ConcreteFactory();*/
        
        // 读取配置文件的参数 cn.colg.example._02.ConcreteFactory
        String factoryName = new Props("factory-name.ini").getStr("concretefactoryName");
        factory = (Factory)Class.forName(factoryName).newInstance();
        
        Product product;
        product = factory.factoryMethod();
        product.methodDiff();
    }
}
