package cn.colg.example._01;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementor();
        AbstractAbstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
    }
}
