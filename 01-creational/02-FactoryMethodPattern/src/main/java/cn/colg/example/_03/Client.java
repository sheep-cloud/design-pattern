package cn.colg.example._03;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        LoggerFactory factory;
        factory = (LoggerFactory)IniUtil.getBean();

        Logger logger;
        logger = factory.createLogger();
        logger.writeLog();
    }
}
