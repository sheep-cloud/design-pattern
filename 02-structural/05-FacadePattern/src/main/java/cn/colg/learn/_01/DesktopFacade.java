package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 外观角色 - 台式机
 *
 * @author colg
 */
@Slf4j
public class DesktopFacade extends AbstractComputerFacade {

    /** 维持对子系统对象的引用 */
    private Cpu cpu = new Cpu();
    private Disk disk = new Disk();
    private Drive drive = new Drive();

    @Override
    public void start() {
        log.info("开启台式机");
        cpu.start();
        disk.start();
        drive.start();
    }

    @Override
    public void shutDown() {
        log.info("关闭台式机");
        drive.shutDown();
        disk.shutDown();
        cpu.shutDown();
    }
}
