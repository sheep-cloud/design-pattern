package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 抽象产品角色
 * 
 * <pre>
 * 它是工厂类所创建的所有对象的父类，封装了各种产品对象的公有方法，它的引入将提高系统的灵活性，使得在工厂类中只需定义一个通用的工厂方法，因为所有创建的具体产品对象都是其子类对象。
 * </pre>
 *
 * @author colg
 */
@Slf4j
public abstract class AbstractProduct {

    /**
     * 所有产品类的公共业务方法
     *
     * @author colg
     */
    public void methodSame() {
        // 公共方法的实现
        log.info("抽象产品角色的公共方法");
    }

    /**
     * 声明抽象业务方法
     *
     * @author colg
     */
    public abstract void methodDiff();
}
