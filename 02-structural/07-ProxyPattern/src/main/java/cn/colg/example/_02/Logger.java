package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 业务类 - 日志记录类，它提供方法Log()来保存日志。
 *
 * @author colg
 */
@Slf4j
public class Logger {

    /**
     * 模拟实现日志记录
     *
     * @param userId
     * @author colg
     */
    public void log(String userId) {
        log.info("更新数据库，用户 [{}] 查询次数加1！", userId);
    }
}
