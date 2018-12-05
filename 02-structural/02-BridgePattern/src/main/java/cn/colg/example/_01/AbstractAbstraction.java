package cn.colg.example._01;

import lombok.Setter;

/**
 * 抽象类
 *
 * @author colg
 */
@Setter
public abstract class AbstractAbstraction {

    /** 定义实现类接口对象，维护该对象 */
    protected Implementor implementor;

    /**
     * 声明抽象业务方法
     *
     * @author colg
     */
    public abstract void operation();
}
