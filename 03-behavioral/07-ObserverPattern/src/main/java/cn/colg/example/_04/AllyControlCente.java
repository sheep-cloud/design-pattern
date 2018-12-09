package cn.colg.example._04;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体目标类 - 具体战队控制中心
 *
 * @author colg
 */
@Slf4j
public class AllyControlCente extends Observable {

    /** 战队名称 */
    protected String allyName;

    /** 定义一个集合用于存储战队成员 */
    private List<Player> obs = new ArrayList<>();

    public AllyControlCente(String allyName) {
        log.info("{} 战队组建成功！", allyName);
        this.allyName = allyName;
    }

    @Override
    public synchronized void addObserver(Observer o) {
        if (!obs.contains(o)) {
            Player player = (Player)o;
            log.info("{} 加入 {} 战队！ 观察者信息 : {}", player.getName(), this.allyName, player);
            obs.add(player);
        }
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        Player player = (Player)o;
        log.info("{} 退出 {} 战队！ 观察者信息 : {}", player.getName(), this.allyName, player);
        obs.remove(player);
    }

    @Override
    public void notifyObservers(Object arg) {
        log.info("{} 战队紧急通知，盟友 {} 遭受敌人攻击！", this.allyName, arg);
        // 遍历观察者集合，调用每一个盟友（自己除外）的支援方法
        for (Player player : obs) {
            if (!arg.equals(player.getName())) {
                player.help();
            }
        }
    }
}
