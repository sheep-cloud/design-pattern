package cn.colg.example._03;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * 目标类 - 战队控制中心类
 *
 * @author colg
 */
@Slf4j
public abstract class AbstractAllyControlCenter {

    /** 战队名称 */
    protected String allyName;

    /** 定义一个集合用于存储战队成员 */
    protected List<Observer> players = new ArrayList<>();

    /**
     * 注册方法，用于向观察者集合中增加一个观察者
     *
     * @param observer
     * @return
     * @author colg
     */
    public AbstractAllyControlCenter join(Observer observer) {
        log.info("{} 加入 {} 战队！ 观察者信息 : {}", observer.getName(), this.allyName, observer);
        players.add(observer);
        return this;
    }

    /**
     * 注销方法，用于在观察者集合中删除一个观察者
     *
     * @param observer
     * @return
     * @author colg
     */
    public AbstractAllyControlCenter quit(Observer observer) {
        log.info("{} 退出 {} 战队！ 观察者信息 : {}", observer.getName(), this.allyName, observer);
        players.remove(observer);
        return this;
    }

    /**
     * 声明抽象通知方法
     *
     * @param name
     * @author colg
     */
    public abstract void notifyObServer(String name);
}
