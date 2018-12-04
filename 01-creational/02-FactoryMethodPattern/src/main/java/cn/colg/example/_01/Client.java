package cn.colg.example._01;

import cn.hutool.setting.dialect.Props;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {

    public static void main(String[] args) {
        Logger logger;
        
        // 读取配置文件的参数
        String type = new Props("logger.ini").getStr("loggerType");
        
        logger = LoggerFactory.createLogger(type);
        logger.writeLog();
    }
}
