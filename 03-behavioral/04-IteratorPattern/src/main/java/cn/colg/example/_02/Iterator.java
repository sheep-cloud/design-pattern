package cn.colg.example._02;

/**
 * 抽象迭代器
 *
 * <pre>
 * 它定义了访问和遍历元素的接口，声明了用于遍历数据元素的方法，
 *  例如：
 *      用于获取第一个元素的first()方法，
 *      用于访问下一个元素的next()方法，
 *      用于判断是否还有下一个元素的hasNext()方法，
 *      用于获取当前元素的currentItem()方法等，
 *  在具体迭代器中将实现这些方法。
 * </pre>
 *
 * @author colg
 */
public interface Iterator {

    /**
     * 将游标指向第一个元素
     *
     * @author colg
     */
    void first();

    /**
     * 将游标指向下一个元素
     *
     * @author colg
     */
    void next();

    /**
     * 判断是否存在下一个元素
     *
     * @return
     * @author colg
     */
    boolean hasNext();

    /**
     * 获取游标指向的当前元素
     *
     * @return
     * @author colg
     */
    Object currentItem();
}
