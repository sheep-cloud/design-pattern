package cn.colg.example._04;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品 - 文件日志记录器
 *
 * @author colg
 */
@Slf4j
public class FileLogger implements Logger {

    @Override
    public void writeLog() {
        log.info("文件日志记录器");
    }
}
