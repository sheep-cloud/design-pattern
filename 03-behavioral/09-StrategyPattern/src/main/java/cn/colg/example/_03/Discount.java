package cn.colg.example._03;

/**
 * 抽象策略类 - 折扣类
 *
 * @author colg
 */
public interface Discount {

    /**
     * 计算打折之后的票价
     *
     * @param price
     * @return
     * @author colg
     */
    double calculate(double price);
}
