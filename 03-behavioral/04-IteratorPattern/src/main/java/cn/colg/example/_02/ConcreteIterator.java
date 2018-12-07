package cn.colg.example._02;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 具体迭代器
 * 
 * <pre>
 * 它实现了抽象迭代器接口，完成对聚合对象的遍历，同时在具体迭代器中通过游标来记录在聚合对象中所处的当前位置，在具体实现时，游标通常是一个表示位置的非负整数
 * </pre>
 *
 * @author colg
 */
@Getter
@Setter
@Accessors(chain = true)
public class ConcreteIterator implements Iterator {

    /** 定义一个游标，用于记录当前访问位置 */
    private int cursor;

    /** 维持一个对具体聚合对象的引用，以便于访问存储在聚合对象中的数据；构造注入 */
    private ConcreteAggregate objects;

    public ConcreteIterator(ConcreteAggregate objects) {
        this.objects = objects;
    }

    @Override
    public void first() {}

    @Override
    public void next() {}

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object currentItem() {
        return null;
    }
}
