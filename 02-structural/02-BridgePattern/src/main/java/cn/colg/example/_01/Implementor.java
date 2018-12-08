package cn.colg.example._01;

/**
 * 实现类接口
 * 
 * <pre>
 * 定义实现类的接口，这个接口不一定要与Abstraction的接口完全一致，事实上这两个接口可以完全不同，一般而言，Implementor接口仅提供基本操作，而Abstraction定义的接口可能会做更多更复杂的操作。
 * Implementor接口对这些基本操作进行了声明，而具体实现交给其子类。
 * 通过关联关系，在Abstraction中不仅拥有自己的方法，还可以调用到Implementor中定义的方法，使用关联关系来替代继承关系。
 * </pre>
 *
 * @author colg
 */
public interface Implementor {

    /**
     * 操作方法
     *
     * @author colg
     */
    void operationImpl();
}
