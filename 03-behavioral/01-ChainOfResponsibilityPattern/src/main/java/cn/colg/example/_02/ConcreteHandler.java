package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体处理者
 * 
 * <pre>
 * 它是抽象处理者的子类，可以处理用户请求，
 * 在具体处理者类中实现了抽象处理者中定义的抽象请求处理方法，在处理请求之前需要进行判断，看是否有相应的处理权限，
 *  如果可以处理请求就处理它，
 *  否则将请求转发给后继者；
 * 在具体处理者中可以访问链中下一个对象，以便请求的转发。
 * </pre>
 *
 * @author colg
 */
@Slf4j
public class ConcreteHandler extends AbstractHandler {

    /**
     * 在具体处理类中通过对请求进行判断可以做出相应的处理。
     *
     * @param request
     */
    @Override
    public void handleRequest(String request) {
        // 请求满足条件
        if ("concrete".equals(request)) {
            // 处理请求
            log.info("ConcreteHandler 处理请求");
        } else {
            // 转发请求
            this.successor.handleRequest(request);
        }
    }
}
