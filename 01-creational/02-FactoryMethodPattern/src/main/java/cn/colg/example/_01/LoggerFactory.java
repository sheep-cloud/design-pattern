package cn.colg.example._01;

/**
 * 工厂角色 - 日志工厂
 *
 * @author colg
 */
public class LoggerFactory {

    /**
     * 静态工厂方法
     *
     * @param args
     * @return
     * @author colg
     */
    public static Logger createLogger(String args) {
        Logger logger = null;
        if (args.equals("db")) {
            // 连接数据库，代码省略
            // 创建数据库日志记录器对象
            logger = new DatabaseLogger();
            // 初始化数据库日志记录器，代码省略
        } else if (args.equals("file")) {
            // 创建日志文件
            // 创建文件日志记录器对象
            logger = new FileLogger();
            // 初始化文件日志记录器，代码省略
        }
        return logger;
    }
}
