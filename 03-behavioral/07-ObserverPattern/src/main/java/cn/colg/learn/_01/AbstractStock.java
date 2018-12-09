package cn.colg.learn._01;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * 目标类 - 股票
 *
 * @author colg
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
@Slf4j
public abstract class AbstractStock {

    /** 股票名称 */
    protected String name;
    /** 股票价格 */
    protected double price;
    /** 股票涨幅后的价格 */
    protected double gainPrice;

    /** 存储所有股民 */
    protected List<Observer> obs = new ArrayList<>();

    /**
     * 添加股民
     *
     * @param o
     * @return
     * @author colg
     */
    public AbstractStock addObserver(Observer o) {
        if (!obs.contains(o)) {
            log.info("添加股民 : {}", o.getName());
            obs.add(o);
        }
        return this;
    }

    /**
     * 删除股民
     *
     * @param o
     * @return
     * @author colg
     */
    public AbstractStock deleteObserver(Observer o) {
        log.info("删除股民 : {}", o.getName());
        obs.remove(o);
        return this;
    }

    /**
     * 通知所有股民
     * 
     * <pre>
     * notify() 关键字无法使用
     * </pre>
     *
     * @author colg
     */
    public abstract void notifyObserver(AbstractStock abstractStock);
}
