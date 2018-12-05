package cn.colg.example._02;

/**
 * 工厂角色
 *
 * @author colg
 */
public class Factory {

    /**
     * 静态工厂方法
     *
     * @param arg
     * @return
     * @author colg
     */
    public static AbstractProduct getProduct(String arg) {
        AbstractProduct product = null;
        if ("A".equals(arg)) {
            product = new ConcreteProductA();
            // 初始化设置product
        } else if ("B".equals(arg)) {
            product = new ConcreteProductB();
            // 初始化设置product
        }
        return product;
    }
}
