package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体策略类 - 儿童折扣类
 *
 * @author colg
 */
@Slf4j
public class ChildrenDiscount implements Discount {

    @Override
    public double calculate(double price) {
        log.info("儿童票");
        return price >= 20 ? price - 10 : price;
    }
}
