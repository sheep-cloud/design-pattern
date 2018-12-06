package cn.colg.example._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 真实主题角色
 *
 * @author colg
 */
@Slf4j
public class RealSubject extends AbstractSubject {

    @Override
    public void request() {
        // 业务方法具体实现
        log.info("真实主题角色 - 业务方法具体实现");
    }
}
