package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体策略类
 * 
 * <pre>
 * 它实现了在抽象策略类中声明的算法，在运行时，具体策略类将覆盖在环境类中定义的抽象策略类对象，使用一种具体的算法实现某个业务处理。
 * </pre>
 *
 * @author colg
 */
@Slf4j
public class ConcreteStrategy implements Strategy {

    @Override
    public void algorithm() {
        log.info("算法 ConcreteStrategy");
    }
}
