package cn.colg.example._02;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        // 使用抽象构件定义
        AbstractComponent component1, component2;
        // 定义具体构件
        component1 = new ConcreteComponent();
        component2 = new ConcreteDecorator(component1);
        component2.operation();
    }
}
