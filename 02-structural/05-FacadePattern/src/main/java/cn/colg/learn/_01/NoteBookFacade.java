package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 外观角色 - 笔记本
 *
 * @author colg
 */
@Slf4j
public class NoteBookFacade extends AbstractComputerFacade {

    /** 维持对子系统对象的引用 */
    private Cpu cpu = new Cpu();
    private Disk disk = new Disk();

    @Override
    public void start() {
        log.info("开启笔记本");
        cpu.start();
        disk.start();
    }

    @Override
    public void shutDown() {
        log.info("关闭笔记本");
        disk.shutDown();
        cpu.shutDown();
    }
}
