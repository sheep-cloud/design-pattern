package cn.colg.example._02;

/**
 * 抽象处理者
 * 
 * <pre>
 * 抽象处理者类定义了对下家的引用对象，以便将请求转发给下家，该对象的访问符可设为protected，在其子类中可以使用。
 * 在抽象处理者类中声明了抽象的请求处理方法，具体实现交由子类完成。
 * </pre>
 *
 * @author colg
 */
public abstract class AbstractHandler {

    /** 维持对下家的引用 - 接班人 */
    protected AbstractHandler successor;

    /**
     * 注入下家
     *
     * @param successor
     */
    public AbstractHandler(AbstractHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理请求
     *
     * @param request
     * @author colg
     */
    public abstract void handleRequest(String request);
}
