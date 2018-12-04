package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品
 *
 * @author colg
 */
@Slf4j
public class ConcreteProduct implements Product {

    public ConcreteProduct() {
        log.info("创建具体产品");
    }

    @Override
    public void methodDiff() {
        log.info("具体产品方法");
    }

}
