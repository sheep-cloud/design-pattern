package cn.colg.learn._02;

import org.slf4j.Logger;

/**
 * 抽象装饰类 - 日志装饰类
 *
 * @author colg
 */
public abstract class AbstractLoggerDecorator extends AbstractLoggerAdapter {

    /** 维持Logger类型成员的引用 */
    private Logger logger;

    /**
     * 注入Logger类型对象
     *
     * @param logger
     */
    public AbstractLoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void debug(String msg) {
        logger.debug(msg);
    }

    @Override
    public void debug(String format, Object arg) {
        logger.debug(format, arg);
    }

    @Override
    public void debug(String format, Object arg1, Object arg2) {
        logger.debug(format, arg1, arg2);
    }

    @Override
    public void debug(String format, Object... arguments) {
        logger.debug(format, arguments);
    }

    @Override
    public void debug(String msg, Throwable t) {
        logger.debug(msg, t);
    }

    // 省略info, error等方法
}
