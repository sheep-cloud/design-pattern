package cn.colg.example._03;

import cn.colg.util.IniUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();
        // 原始票价
        double originalPrice = 60.0;
        // 折后价
        double currentPrice;

        mt.setPrice(originalPrice);
        log.info("原始价为: {}", originalPrice);
        log.info("----------------------------------------------------------------------------------------------------");
        
        Discount discount = (Discount)IniUtil.getBean("example._03");
        // 注入折扣对象
        mt.setDiscount(discount);
        
        currentPrice = mt.getPrice();
        log.info("折后价为 : {}", currentPrice);
    }
}
