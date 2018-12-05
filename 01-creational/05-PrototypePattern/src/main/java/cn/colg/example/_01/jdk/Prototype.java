package cn.colg.example._01.jdk;

/**
 * 抽象原型类
 *
 * @author colg
 */
public interface Prototype {

    /**
     * 浅克隆
     *
     * @return
     * @author colg
     * @throws CloneNotSupportedException
     */
    Prototype shallowClone() throws CloneNotSupportedException;
}
