package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品
 * 
 * <pre>
 * 它实现了抽象产品接口，某种类型的具体产品由专门的具体工厂创建，具体工厂和具体产品之间一一对应。
 * </pre>
 *
 * @author colg
 */
@Slf4j
public class ConcreteProduct implements Product {

    @Override
    public void methodDiff() {
        log.info("具体产品 ConcreteProduct 方法");
    }
}
