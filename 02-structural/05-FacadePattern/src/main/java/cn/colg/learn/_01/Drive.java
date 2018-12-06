package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 子系统角色 - 光驱
 *
 * @author colg
 */
@Slf4j
public class Drive {

    public void start() {
        log.info("光驱启动");
    }
    
    public void shutDown() {
        log.info("关闭光驱");
    }
}
