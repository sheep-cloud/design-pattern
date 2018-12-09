package cn.colg.example._03;

import lombok.Setter;

/**
 * 环境类 - 电影票类
 *
 * @author colg
 */
public class MovieTicket {

    /** 电影票价格 */
    @Setter
    private double price;

    /** 维持一个抽象折扣类的引用；设值注入 */
    @Setter
    private Discount discount;

    public double getPrice() {
        // 调用折扣类的折扣价计算方法
        return discount.calculate(this.price);
    }
}
