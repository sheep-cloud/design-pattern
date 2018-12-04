package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品角色B
 *
 * @author colg
 */
@Slf4j
public class ConcreteProductB extends Product {

    @Override
    public void methodDiff() {
        log.info("具体产品角色B的业务方法");
    }

}
