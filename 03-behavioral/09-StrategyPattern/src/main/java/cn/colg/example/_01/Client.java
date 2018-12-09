package cn.colg.example._01;

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
        log.info("原始价为 : {}", originalPrice);
        log.info("----------------------------------------------------------------------------------------------------");

        // 学生票
        mt.setType("student");
        currentPrice = mt.getPrice();
        log.info("折后价为 : {}", currentPrice);
        log.info("----------------------------------------------------------------------------------------------------");

        // 儿童票
        mt.setType("children");
        currentPrice = mt.getPrice();
        log.info("折后价为 : {}", currentPrice);
        log.info("----------------------------------------------------------------------------------------------------");

        // vip票
        mt.setType("vip");
        currentPrice = mt.getPrice();
        log.info("折后价为 : {}", currentPrice);
    }
}
