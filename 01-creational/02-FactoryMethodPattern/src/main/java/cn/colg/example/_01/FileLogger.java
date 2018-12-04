package cn.colg.example._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品角色 - 文件日志记录器
 *
 * @author colg
 */
@Slf4j
public class FileLogger implements Logger {

    public FileLogger() {
        log.info("创建文件日志记录器");
    }

    @Override
    public void writeLog() {
        log.info("文件日志记录器");
    }
}
