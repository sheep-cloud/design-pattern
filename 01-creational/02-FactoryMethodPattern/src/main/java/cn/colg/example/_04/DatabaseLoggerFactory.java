package cn.colg.example._04;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体工厂 - 数据库日志工厂
 *
 * @author colg
 */
@Slf4j
public class DatabaseLoggerFactory extends AbstractLoggerFactory {

    @Override
    public Logger createLogger() {
        // 使用默认方式连接数据库，代码省略
        log.info("使用默认方式连接数据库");
        Logger logger = new DatabaseLogger();
        // 初始化数据库日志记录器，代码省略
        return logger;
    }

    @Override
    public Logger createLogger(String args) {
        // 使用参数args连接数据库，代码省略
        Logger logger = new DatabaseLogger();
        // 初始化数据库日志记录器，代码省略
        return logger;
    }

    @Override
    public Logger createLogger(Object obj) {
        // 使用封装在对象obj中的数据来连接数据库，代码省略
        Logger logger = new DatabaseLogger();
        // 使用封装在对象obj中的数据来初始化数据库日志记录器，代码省略
        return logger;
    }
}
