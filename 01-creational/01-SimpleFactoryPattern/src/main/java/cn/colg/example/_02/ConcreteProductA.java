package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品角色A
 *
 * @author colg
 */
@Slf4j
public class ConcreteProductA extends AbstractProduct {

    @Override
    public void methodDiff() {
        log.info("具体产品 ConcreteProductA 的业务方法");
    }
}
