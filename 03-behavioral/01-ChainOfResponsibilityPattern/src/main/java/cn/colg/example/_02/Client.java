package cn.colg.example._02;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        AbstractHandler handler, get, post;
        handler = new ConcreteHandler();
        get = new ConcreteGetHandler();
        post = new ConcretePostHandler();

        // 创建责任链
        handler.setSuccessor(get.setSuccessor(post));

        handler.handleRequest("post");
    }
}
