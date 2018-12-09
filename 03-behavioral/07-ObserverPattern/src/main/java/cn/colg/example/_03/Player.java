package cn.colg.example._03;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体观察者 - 战队成员类
 *
 * @author colg
 */
@ToString
@Slf4j
public class Player implements Observer {

    /** 成员名称；设值注入；构造注入 */
    @Getter
    @Setter
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        log.info("坚持住， {} 来救你！", this.name);
    }

    @Override
    public void beAttacked(AbstractAllyControlCenter allyControlCenter) {
        log.info("{} 被攻击！", this.name);
        allyControlCenter.notifyObServer(name);
    }
}
