package cn.colg.example._03;

import java.util.List;

/**
 * 具体聚合类 - 商品数据类
 *
 * @author colg
 */
public class ProductList extends AbstractObjectList {

    public ProductList(List<Object> objects) {
        super(objects);
    }

    /**
     * 实现创建迭代器对象的具体工厂方法
     *
     * @return
     */
    @Override
    public Iterator createIterator() {
        return new ProductIterator(this);
    }
}
