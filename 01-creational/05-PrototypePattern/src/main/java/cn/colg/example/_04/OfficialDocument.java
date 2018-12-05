package cn.colg.example._04;

/**
 * 抽象原型类 - 抽象公文接口，也可定义为抽象类，提供clone()方法的实现，将业务方法声明为抽象方法
 *
 * @author colg
 */
public interface OfficialDocument extends Cloneable {

    /**
     * 浅克隆
     *
     * @return
     * @author colg
     * @throws CloneNotSupportedException 
     */
    OfficialDocument shallowClone() throws CloneNotSupportedException;

    /**
     * 显示
     *
     * @author colg
     */
    void display();
}
