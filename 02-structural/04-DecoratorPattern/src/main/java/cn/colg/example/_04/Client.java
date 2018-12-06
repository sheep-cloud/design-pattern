package cn.colg.example._04;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        // 使用抽象构件类型定义
        AbstractComponent document;
        // 使用具体构件类型定义
        Deleter deleter;
        document = new Document();
        deleter = new Deleter(document);
        // 调用原有业务方法
        deleter.display();
        // 调用新增业务方法
        deleter.delete();
    }
}
