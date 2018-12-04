package cn.colg.example._04;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品 - 数据库日志记录器
 *
 * @author colg
 */
@Slf4j
public class DatabaseLogger implements Logger {

    public DatabaseLogger() {
        log.info("创建数据库日志记录器");
    }

    @Override
    public void writeLog() {
        log.info("数据库日志记录器 ");
    }
}
