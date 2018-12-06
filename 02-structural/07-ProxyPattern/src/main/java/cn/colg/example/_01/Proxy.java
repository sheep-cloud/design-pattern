package cn.colg.example._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 代理主题角色
 *
 * @author colg
 */
@Slf4j
public class Proxy extends AbstractSubject {

    /** 维持一个对真实主题对象的引用 */
    private RealSubject realSubject = new RealSubject();

    @Override
    public void request() {
        this.preRequest();
        // 调用真实主题对象的方法
        realSubject.request();
        this.postRequest();
    }

    private void preRequest() {
        log.info("代理主题角色 - 附加约束");
    }

    private void postRequest() {
        log.info("代理主题角色 - 附加功能");
    }

}
