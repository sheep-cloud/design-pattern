package cn.colg.example._04;

/**
 * 具体工厂 - 文件日志工厂
 *
 * @author colg
 */
public class FileLoggerFactory extends AbstractLoggerFactory {

    @Override
    public Logger createLogger() {
        // 使用默认方式创建日志文件
        Logger logger = new FileLogger();
        // 初始化文件日志记录器，代码省略
        return logger;
    }

    @Override
    public Logger createLogger(String args) {
        // 使用参数args创建日志文件，代码省略
        Logger logger = new FileLogger();
        // 使用参数args初始化文件日志记录器，代码省略
        return logger;
    }

    @Override
    public Logger createLogger(Object obj) {
        // 使用封装在对象obj中的数据来创建日志文件，代码省略
        Logger logger = new FileLogger();
        // 使用封装在对象obj中的数据初始化文件日志记录器，代码省略
        return logger;
    }
}
