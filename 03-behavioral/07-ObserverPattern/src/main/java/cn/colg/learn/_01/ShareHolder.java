package cn.colg.learn._01;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体观察者 - 股民
 *
 * @author colg
 */
@Getter
@Setter
@ToString
@Slf4j
public class ShareHolder implements Observer {

    /** 股民名称 */
    private String name;

    public ShareHolder(String name) {
        this.name = name;
    }

    @Override
    public void updata(AbstractStock abstractStock) {
        // 当股票购买者所购买的某支股票价格变化幅度达到5%时，系统将自动发送通知（包括新价格）给购买该股票的所有股民。
        double price = abstractStock.getPrice();
        // 涨
        double rise = price * 1.05;
        // 跌
        double fall = price / 1.05;
        if (abstractStock.getGainPrice() < fall || abstractStock.getGainPrice() > rise) {
            abstractStock.notifyObserver(abstractStock);
        }
    }

    @Override
    public void show(AbstractStock abstractStock) {
        log.info("通知 : {}， {} 股票价格变化幅度达到5%", this.name, abstractStock.getName());
    }
}
