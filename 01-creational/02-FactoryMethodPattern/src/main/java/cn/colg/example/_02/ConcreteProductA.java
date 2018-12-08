package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品
 * 
 * @author colg
 */
@Slf4j
public class ConcreteProductA implements Product {

    @Override
    public void methodDiff() {
        log.info("具体产品 ConcreteProductA 方法");
    }
}
