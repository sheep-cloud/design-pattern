package cn.colg.example._03;

/**
 * 具体工厂
 *
 * @author colg
 */
public class ConcreteFactory1 extends AbstractFactory {

    /**
     * 工厂方法一
     *
     * @return
     */
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    /**
     * 工厂方法二
     *
     * @return
     */
    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }

}
