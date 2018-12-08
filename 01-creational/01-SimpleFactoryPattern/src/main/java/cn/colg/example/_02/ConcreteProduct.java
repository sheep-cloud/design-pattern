package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品角色
 * 
 * <pre>
 * 它是简单工厂模式的创建目标，所有被创建的对象都充当这个角色的某个具体类的实例。
 * 每一个具体产品角色都继承了抽象产品角色，需要实现在抽象产品中声明的抽象方法。
 * </pre>
 *
 * @author colg
 */
@Slf4j
public class ConcreteProduct extends AbstractProduct {

    @Override
    public void methodDiff() {
        log.info("具体产品 ConcreteProduct 的实现方法");
    }
}
