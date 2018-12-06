package cn.colg.learn._01;

/**
 * 抽象外观角色 - 电脑
 *
 * @author colg
 */
public abstract class AbstractComputerFacade {

    /**
     * 开机
     *
     * @author colg
     */
    public abstract void start();

    /**
     * 关机
     *
     * @author colg
     */
    public abstract void shutDown();
}
