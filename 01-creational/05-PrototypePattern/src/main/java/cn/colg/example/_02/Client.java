package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        WeeklyLog log1, log2;
        log1 = new WeeklyLog();
        log1.setName("张无忌")
            .setDate("第12周")
            .setContent("周周工作很忙，每天加班！");
        log.info("log1 : {}", log1);

        // 调用克隆方法创建克隆对象
        log2 = log1.shallowClone();
        log2.setDate("第13周");
        log.info("log2 : {}", log2);

        log.info("log1 == log2 : {}", log1 == log2);
        log.info("log1.getName() == log2.getName() : {}", log1.getName() == log2.getName());
        log.info("log1.getDate() == log2.getDate() : {}", log1.getDate() == log2.getDate());
        log.info("log1.getContent() == log2.getContent() : {}", log1.getContent() == log2.getContent());
    }
}
