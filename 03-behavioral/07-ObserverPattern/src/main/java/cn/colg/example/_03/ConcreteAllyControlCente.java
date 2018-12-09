package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体目标类 - 具体战队控制中心类
 *
 * @author colg
 */
@Slf4j
public class ConcreteAllyControlCente extends AbstractAllyControlCenter {

    public ConcreteAllyControlCente(String allyName) {
        log.info("{} 战队组建成功！", allyName);
        this.allyName = allyName;
    }

    @Override
    public void notifyObServer(String name) {
        log.info("{} 战队紧急通知，盟友 {} 遭受敌人攻击！", this.allyName, name);
        // 遍历观察者集合，调用每一个盟友（自己除外）的支援方法
        for (Observer play : players) {
            if (!name.equals(play.getName())) {
                play.help();
            }
        }
    }
}
