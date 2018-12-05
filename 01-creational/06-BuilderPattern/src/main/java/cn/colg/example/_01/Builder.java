package cn.colg.example._01;

/**
 * 抽象创建者
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
     * 创建PartC
     *
     * @author colg
     */
    void buildPartC();

    /**
     * 返回对象
     *
     * @return
     * @author colg
     */
    Product getResult();
}
