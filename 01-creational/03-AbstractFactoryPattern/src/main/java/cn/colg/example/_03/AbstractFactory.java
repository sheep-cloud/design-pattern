package cn.colg.example._03;

/**
 * 抽象工厂
 *
 * @author colg
 */
public abstract class AbstractFactory {

    /**
     * 工厂方法一
     *
     * @return
     * @author colg
     */
    public abstract AbstractProductA createProductA();

    /**
     * 工厂方法二
     *
     * @return
     * @author colg
     */
    public abstract AbstractProductB createProductB();
}
