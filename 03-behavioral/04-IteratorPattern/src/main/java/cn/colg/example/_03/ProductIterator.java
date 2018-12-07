package cn.colg.example._03;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * 具体迭代器 - 商品迭代器
 *
 * @author colg
 */
@Getter
@Setter
public class ProductIterator implements Iterator {

    /** 定义一个游标，用于记录正向遍历的位置 */
    private int positiveCursor;

    /** 定义一个游标，用于记录逆向遍历的位置 */
    private int reverseCursor;

    /** 维持一个对具体聚合对象的引用，以便于访问存储在聚合对象中的数据；构造注入 */
    private ProductList productList;

    private List<Object> products;

    public ProductIterator(ProductList productList) {
        this.productList = productList;
        // 获取集合对象
        this.products = productList.getObjects();
        // 设置正向遍历游标的初始值
        positiveCursor = 0;
        // 设置逆向遍历游标的初始值
        reverseCursor = products.size() - 1;
    }

    @Override
    public void next() {
        if (positiveCursor < products.size()) {
            positiveCursor++;
        }
    }

    @Override
    public boolean isLast() {
        return positiveCursor == products.size();
    }

    @Override
    public void previous() {
        if (reverseCursor > -1) {
            reverseCursor--;
        }
    }

    @Override
    public boolean isFirst() {
        return reverseCursor == -1;
    }

    @Override
    public Object getNextItem() {
        return products.get(positiveCursor);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(reverseCursor);
    }
}
