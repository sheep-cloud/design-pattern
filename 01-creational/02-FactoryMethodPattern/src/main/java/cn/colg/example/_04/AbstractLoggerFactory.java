package cn.colg.example._04;

/**
 * 抽象工厂 - 日志工厂
 * 
 * <pre>
 * 1. 引入重载方法，实现多种创建对象方式
 * 2. 简化客户端的使用，隐藏工厂方法，在工厂类中直接调用产品类的业务方法，客户端无需调用工厂方法创建产品
 * 3. 改为抽象类
 * </pre>
 *
 * @author colg
 */
public abstract class AbstractLoggerFactory {

    /**
     * 在工厂类中直接调用日志记录器类的业务方法
     *
     * @author colg
     */
    public void writeLog() {
        Logger logger = this.createLogger();
        logger.writeLog();
    }

    /**
     * 工厂方法
     *
     * @return
     * @author colg
     */
    public abstract Logger createLogger();

    /**
     * 工厂方法二
     *
     * @param args
     * @return
     * @author colg
     */
    public abstract Logger createLogger(String args);

    /**
     * 工厂方法三
     *
     * @param obj
     * @return
     * @author colg
     */
    public abstract Logger createLogger(Object obj);
}
