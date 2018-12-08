package cn.colg.example._01;

/**
 * 抽象类
 * 
 * <pre>
 * 用于定义抽象类的接口，它一般是抽象类而不是接口，
 * 其中定义了一个Implementor（实现类接口）类型的对象并可以维护该对象，它与Implementor之间具有关联关系，它既可以包含抽象业务方法，也可以包含具体业务方法。
 * </pre>
 *
 * @author colg
 */
public abstract class AbstractAbstraction {

    /** 定义实现类接口对象，维护该对象；构造注入 */
    protected Implementor implementor;

    public AbstractAbstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    /**
     * 声明抽象业务方法
     *
     * @author colg
     */
    public abstract void operation();
}
