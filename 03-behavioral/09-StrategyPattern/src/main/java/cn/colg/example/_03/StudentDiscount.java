package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体策略类 - 学生票折扣类
 *
 * @author colg
 */
@Slf4j
public class StudentDiscount implements Discount {

    @Override
    public double calculate(double price) {
        log.info("学生票");
        return price * 0.8;
    }
}
