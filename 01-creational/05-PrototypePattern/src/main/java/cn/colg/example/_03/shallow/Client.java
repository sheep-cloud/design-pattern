package cn.colg.example._03.shallow;

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
        // 将附件添加到log1中
        Attachment attachment = new Attachment().setName("附件");
        log1.setAttachment(attachment);
        // 调用克隆方法创建克隆对象
        log2 = log1.shallowClone();

        // 比较周报
        log.info("log1 == log2 : {}", log1 == log2);
        log.info("log1 : {}", log1);
        log.info("log2 : {}", log2);

        // 比较附件；比较附件对象的内存地址时输出true，说明它们在内存中是同一个对象
        log.info("log1.getAttachment() == log2.getAttachment() : {}", log1.getAttachment() == log2.getAttachment());
    }
}
