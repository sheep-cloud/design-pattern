package cn.colg.example._01;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * 电影票类
 *
 * @author colg
 */
@Getter
@Setter
@Slf4j
public class MovieTicket {

    /** 电影票价格 */
    private double price;
    /** 电影票类型 */
    private String type;

    public double getPrice() {
        return this.calculate();
    }

    /**
     * 计算打折之后的票价
     *
     * @return
     * @author colg
     */
    public double calculate() {
        if ("student".equals(this.type)) {
            // 学生票折后票价计算
            log.info("学生票");
            return this.price * 0.8;
        } else if ("children".equals(this.type)) {
            // 儿童票折后票价计算
            log.info("儿童票");
            return this.price >= 20 ? this.price - 10 : this.price;
        } else if (this.type.equals("vip")) {
            // VIP票折后票价计算
            log.info("VIP票");
            log.info("增加积分！");
            return this.price * 0.5;
        } else {
            // 如果不满足任何打折要求，则返回原始票价
            return this.price;
        }
    }
}
