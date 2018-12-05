package cn.colg.example._01;

import cn.colg.util.IniUtil;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {

    public static void main(String[] args) {
        Logger logger;
        String type = IniUtil.getStr("example._01");
        logger = LoggerFactory.createLogger(type);
        logger.writeLog();
    }
}
