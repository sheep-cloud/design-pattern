package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体工厂
 *
 * @author colg
 */
@Slf4j
public class ConcreteFactory implements Factory {

    public ConcreteFactory() {
        log.info("创建具体工厂");
    }

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }

}
