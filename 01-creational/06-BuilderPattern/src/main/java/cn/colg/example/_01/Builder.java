package cn.colg.example._01;

/**
 * 抽象创建者
 * 
 * <pre>
 * 它为创建一个产品Product对象的各个部件指定抽象接口，
 * 在该接口中一般声明两类方法，一类方法是buildPartX()，它们用于创建复杂对象的各个部件；
 * 另一类方法是getResult()，它们用于返回复杂对象。
 * Builder既可以是抽象类，也可以是接口。
 * </pre>
 *
 * @author colg
 */
public interface Builder {

    /**
     * 创建PartA
     *
     * @author colg
     */
    void buildPartA();

    /**
     * 创建PartB
     *
     * @author colg
     */
    void buildPartB();

    /**
     * 返回对象
     *
     * @return
     * @author colg
     */
    Product getResult();
}
