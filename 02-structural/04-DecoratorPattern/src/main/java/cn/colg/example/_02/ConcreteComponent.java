package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体构件类
 *
 * @author colg
 */
@Slf4j
public class ConcreteComponent extends AbstractComponent {

    @Override
    public void operation() {
        log.info("具体构件的业务方法");
    }
}
