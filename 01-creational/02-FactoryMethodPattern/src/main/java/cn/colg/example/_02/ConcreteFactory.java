package cn.colg.example._02;

/**
 * 具体工厂
 * 
 * <pre>
 * 它是抽象工厂类的子类，实现了抽象工厂中定义的工厂方法，并可由客户端调用，返回一个具体产品类的实例。
 * </pre>
 *
 * @author colg
 */
public class ConcreteFactory implements Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
