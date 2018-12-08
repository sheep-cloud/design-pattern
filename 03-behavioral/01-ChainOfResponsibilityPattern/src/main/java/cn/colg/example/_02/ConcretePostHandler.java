package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体处理者
 *
 * @author colg
 */
@Slf4j
public class ConcretePostHandler extends AbstractHandler {

    @Override
    public void handleRequest(String request) {
        if ("post".equals(request)) {
            // 处理请求
            log.info("ConcretePostHandler 处理请求");
        } else {
            // 已经没有下家可以处理请求
            log.info("拒绝请求！");
        }
    }

}
