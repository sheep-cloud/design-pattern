package cn.colg.example._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 接收者
 * 
 * <pre>
 * 接收者执行与请求相关的操作，它具体实现对请求的业务处理
 * </pre>
 *
 * @author colg
 */
@Slf4j
public class Receiver {

    public void action() {
        // 具体操作
        log.info("接收者的具体方法");
    }
}
