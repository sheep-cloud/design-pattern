package cn.colg.example._04;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 环境类
 *
 * @author colg
 */
@Getter
@Setter
@ToString
public class Switch {
    /** 定义三个静态的状态对象；设值注入 */
    private static State state, onState, offState;

    /** 环境名称 */
    private String name;

    public Switch(String name) {
        this.name = name;
        onState = new OnState();
        offState = new OffState();
        Switch.state = onState;
    }

    public static void setState(State state) {
        Switch.state = state;
    }

    public static State getState(String type) {
        if ("on".equals(type)) {
            return onState;
        } else {
            return offState;
        }
    }

    /**
     * 打开开关
     *
     * @author colg
     */
    public void on() {
        state.on(this);
    }

    public void off() {
        state.off(this);
    }

    public static State getState() {
        return state;
    }
}
