package cn.colg.example._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 真实主题角色
 * 
 * <pre>
 * 它定义了代理角色所代表的真实对象，在真实主题角色中实现了真实的业务操作，客户端可以通过代理主题角色间接调用真实主题角色中定义的操作。
 * </pre>
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
