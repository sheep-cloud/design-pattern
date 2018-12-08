package cn.colg.example._02;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 工厂角色
 * 
 * <pre>
 * 工厂角色即工厂类，它是简单工厂模式的核心，负责实现创建所有产品实例的内部逻辑；
 * 工厂类可以被外界直接调用，创建所需的产品对象；
 * 在工厂类中提供了静态的工厂方法factoryMethod()，它的返回类型为抽象产品类型Product。
 * </pre>
 *
 * @author colg
 */
@Slf4j
public class Factory {

    /**
     * 静态工厂方法
     *
     * @param arg
     * @return
     * @author colg
     */
    public static AbstractProduct getProduct(String arg) {
        AbstractProduct product = null;
        if (StrUtil.isEmpty(arg)) {
            product = new ConcreteProduct();
            log.info("初始化设置 ConcreteProduct");
        } else if ("A".equals(arg)) {
            log.info("初始化设置 ConcreteProductA");
            product = new ConcreteProductA();
        } else if ("B".equals(arg)) {
            log.info("初始化设置 ConcreteProductB");
            product = new ConcreteProductB();
        }
        return product;
    }
}
