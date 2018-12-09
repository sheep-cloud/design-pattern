package cn.colg.learn._01;

/**
 * 抽象观察者
 *
 * @author colg
 */
public interface Observer {

    /**
     * 获取名称
     *
     * @return
     * @author colg
     */
    String getName();

    /**
     * 设置名称
     *
     * @param name
     * @author colg
     */
    void setName(String name);

    /**
     * 声明响应方法
     *
     * @param abstractStock
     * @author colg
     */
    void updata(AbstractStock abstractStock);

    /**
     * 显示涨幅后的股票信息
     *
     * @param abstractStock
     * @author colg
     */
    void show(AbstractStock abstractStock);
}
