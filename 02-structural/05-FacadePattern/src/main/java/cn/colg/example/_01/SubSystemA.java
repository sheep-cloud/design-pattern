package cn.colg.example._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 子系统角色 - 子系统A
 * 
 * <pre>
 * 在软件系统中可以有一个或者多个子系统角色，每一个子系统可以不是一个单独的类，而是一个类的集合，它实现子系统的功能；
 * 每一个子系统都可以被客户端直接调用，或者被外观角色调用，它处理由外观类传过来的请求；
 * 子系统并不知道外观的存在，对于子系统而言，外观角色仅仅是另外一个客户端而已。
 * </pre>
 *
 * @author colg
 */
@Slf4j
public class SubSystemA {

    public void methodA() {
        log.info("子系统A - 业务实现方法A");
    }
}
