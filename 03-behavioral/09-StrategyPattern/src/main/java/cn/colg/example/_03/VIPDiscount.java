package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体策略类 - VIP会员票折扣类
 *
 * @author colg
 */
@Slf4j
public class VIPDiscount implements Discount {

    @Override
    public double calculate(double price) {
        log.info("VIP票");
        log.info("增加积分！");
        return price * 0.5;
    }
}
