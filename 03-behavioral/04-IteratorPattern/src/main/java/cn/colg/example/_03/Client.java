package cn.colg.example._03;

import java.util.List;

import cn.hutool.core.collection.CollUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        List<Object> products = CollUtil.newArrayList("倚天剑", "屠龙刀", "断肠草", "葵花宝典", "四十二章经");

        AbstractObjectList list;
        Iterator iterator;

        // 创建聚合对象
        list = new ProductList(products);

        // 创建迭代器对象
        iterator = list.createIterator();

        log.info("正向遍历 : {}", products);
        while (!iterator.isLast()) {
            log.info("iterator.getNextItem() : {}", iterator.getNextItem());
            iterator.next();
        }
        
        log.info("逆向遍历 : {}", products);
        while (!iterator.isFirst()) {
            log.info("iterator.getPreviousItem() : {}", iterator.getPreviousItem());
            iterator.previous();
        }

        products.iterator();
    }
}
