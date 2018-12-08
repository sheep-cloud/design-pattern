package cn.colg.example._02;

/**
 * 具体工厂
 * 
 * @author colg
 */
public class ConcreteFactoryA implements Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
