package cn.colg.example._02;

/**
 * 抽象聚合类
 * 
 * <pre>
 * 它用于存储和管理元素对象，声明一个createIterator()方法用于创建一个迭代器对象，充当抽象迭代器工厂角色。
 * </pre>
 *
 * @author colg
 */
public interface Aggregate {

    /**
     * 创建迭代器对象
     *
     * @return
     * @author colg
     */
    Iterator createIterator();
}
