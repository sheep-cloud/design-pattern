package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体处理者
 * 
 * <pre>
 * 具体处理者是抽象处理者的子类，它具有两大作用：
 *  第一是处理请求，不同的具体处理者以不同的形式实现抽象请求处理方法handleRequest()；
 *  第二是转发请求，如果该请求超出了当前处理者类的权限，可以将该请求转发给下家。
 * </pre>
 *
 * @author colg
 */
@Slf4j
public class ConcreteHandler extends AbstractHandler {

    public ConcreteHandler(AbstractHandler successor) {
        super(successor);
    }

    /**
     * 在具体处理类中通过对请求进行判断可以做出相应的处理。
     *
     * @param request
     */
    @Override
    public void handleRequest(String request) {
        // 请求满足条件
        if ("get".equals(request)) {
            // 处理请求
            log.info("处理请求");
        }
        // 转发请求
        this.successor.handleRequest(request);
    }

}
