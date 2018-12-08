package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体处理者
 *
 * @author colg
 */
@Slf4j
public class ConcreteGetHandler extends AbstractHandler {

    @Override
    public void handleRequest(String request) {
        if ("get".equals(request)) {
            // 处理请求
            log.info("ConcreteGetHandler 处理请求");
        } else {
            // 转发请求
            this.successor.handleRequest(request);
        }
    }

}
