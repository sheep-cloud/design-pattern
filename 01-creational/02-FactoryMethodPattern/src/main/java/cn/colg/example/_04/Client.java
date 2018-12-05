package cn.colg.example._04;

import cn.colg.util.IniUtil;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        AbstractLoggerFactory factory;
        factory = (AbstractLoggerFactory)IniUtil.getBean("example._04");
        factory.writeLog();
    }
}
