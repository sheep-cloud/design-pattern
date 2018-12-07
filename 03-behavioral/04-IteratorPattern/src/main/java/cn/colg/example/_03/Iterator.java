package cn.colg.example._03;

/**
 * 抽象迭代器
 *
 * @author colg
 */
public interface Iterator {

    /**
     * 移至下一个元素
     *
     * @author colg
     */
    void next();

    /**
     * 判断是否为最后一个元素
     *
     * @return
     * @author colg
     */
    boolean isLast();

    /**
     * 移至上一个元素
     *
     * @author colg
     */
    void previous();

    /**
     * 判断是否为第一个元素
     *
     * @return
     * @author colg
     */
    boolean isFirst();

    /**
     * 获取下一个元素
     *
     * @return
     * @author colg
     */
    Object getNextItem();

    /**
     * 获取上一个元素
     *
     * @return
     * @author colg
     */
    Object getPreviousItem();
}
