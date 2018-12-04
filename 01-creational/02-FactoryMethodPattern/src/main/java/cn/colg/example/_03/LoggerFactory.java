package cn.colg.example._03;

/**
 * 抽象工厂 - 日志工厂
 *
 * @author colg
 */
public interface LoggerFactory {

    /**
     * 工厂方法
     *
     * @return
     * @author colg
     */
    Logger createLogger();
}
