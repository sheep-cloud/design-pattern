package cn.colg.learn._02;

import org.slf4j.Logger;

import cn.colg.learn._02.JSONLogger.JSONLoggerFactory;
import cn.colg.learn._02.XMLLogger.XMLLoggerFactory;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        // 使用JSON日志工厂获取jsonLogger对象
        Logger jsonLogger = JSONLoggerFactory.getLogger(Client.class);
        jsonLogger.debug("JSONLogger - Decorator Pattern");

        // 使用XML日志工厂获取xmlLogger对象
        Logger xmlLogger = XMLLoggerFactory.getLogger(Client.class);
        xmlLogger.debug("XMLLogger - Decorator Pattern");
    }
}
