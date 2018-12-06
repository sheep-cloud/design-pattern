package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 子系统角色 - CPU
 *
 * @author colg
 */
@Slf4j
public class Cpu {

    public void start() {
        log.info("启动CPU");
    }
    
    public void shutDown() {
        log.info("关闭CPU");
    }
}
