package cn.colg.example._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 代理主题角色
 * 
 * <pre>
 * 它包含了对真实主题的引用，从而可以在任何时候操作真实主题对象；
 * 在代理主题角色中提供一个与真实主题角色相同的接口，以便在任何时候都可以替代真实主题；
 * 代理主题角色还可以控制对真实主题的使用，负责在需要的时候创建和删除真实主题对象，并对真实主题对象的使用加以约束。
 * 通常，在代理主题角色中，客户端在调用所引用的真实主题操作之前或之后还需要执行其他操作，而不仅仅是单纯调用真实主题对象中的操作。
 * </pre>
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
