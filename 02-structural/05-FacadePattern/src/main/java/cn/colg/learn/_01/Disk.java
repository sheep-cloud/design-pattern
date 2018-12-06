package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 子系统角色 - 硬盘
 *
 * @author colg
 */
@Slf4j
public class Disk {

    public void start() {
        log.info("启动硬盘");
    }

    public void shutDown() {
        log.info("关闭硬盘");
    }
}
