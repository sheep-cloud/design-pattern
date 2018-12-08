package cn.colg.example._01;

/**
 * 扩充抽象类
 * 
 * <pre>
 * 扩充由Abstraction定义的接口，通常情况下它不再是抽象类而是具体类，它实现了在Abstraction中声明的抽象业务方法，在RefinedAbstraction中可以调用在Implementor中定义的业务方法。
 * </pre>
 *
 * @author colg
 */
public class RefinedAbstraction extends AbstractAbstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        // 业务代码

        // 调用实现类的方法
        implementor.operationImpl();

        // 业务代码
    }

}
