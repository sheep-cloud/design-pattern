package cn.colg.example._01.all;

/**
 * 抽象原型类
 * 
 * <pre>
 * 它是声明克隆方法的接口，是所有具体原型类的公共父类，可以是抽象类也可以是接口，甚至还可以是具体实现类。
 * </pre>
 *
 * @author colg
 */
public interface Prototype {

    /**
     * 浅克隆
     *
     * @return
     * @author colg
     */
    Prototype shallowClone();
}
