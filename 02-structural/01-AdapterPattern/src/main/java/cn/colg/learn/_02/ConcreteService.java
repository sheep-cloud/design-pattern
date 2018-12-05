package cn.colg.learn._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体业务类
 *
 * @author colg
 */
@Slf4j
public class ConcreteService extends AbstractServiceAdapter {

    @Override
    public void add(String data) {
        log.info("添加了数据 : {}", data);
    }
}
