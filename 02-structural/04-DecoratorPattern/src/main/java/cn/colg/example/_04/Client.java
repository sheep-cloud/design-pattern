package cn.colg.example._04;

import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        // 使用抽象构件类型定义
        AbstractComponent document;
        // 使用具体构件类型定义
        Deleter deleter;
        document = new Document();
        deleter = new Deleter(document);
        // 调用装饰后的业务方法
        deleter.display();
        log.info("----------------------------------------------------------------------------------------------------");

        // 调用新增业务方法
        deleter.delete();
    }
}
