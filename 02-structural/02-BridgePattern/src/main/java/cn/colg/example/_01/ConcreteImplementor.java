package cn.colg.example._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体实现类
 *
 * @author colg
 */
@Slf4j
public class ConcreteImplementor implements Implementor {

    @Override
    public void operationImpl() {
        log.info("具体实现类");
    }
}
