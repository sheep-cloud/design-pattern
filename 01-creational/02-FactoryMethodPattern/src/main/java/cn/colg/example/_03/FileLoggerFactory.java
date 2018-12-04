package cn.colg.example._03;

/**
 * 具体工厂 - 文件日志工厂
 *
 * @author colg
 */
public class FileLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        // 创建日志文件
        // 创建文件日志记录器对象
        Logger logger = new FileLogger();
        // 初始化文件日志记录器，代码省略
        return logger;
    }
}
