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
    public static Product getProduct(String arg) {
        Product product = null;
        if (arg.equals("A")) {
            product = new ConcreteProductA();
            // 初始化设置product
        } else if (arg.equals("B")) {
            product = new ConcreteProductB();
            // 初始化设置product
        }
        return product;
    }
}
