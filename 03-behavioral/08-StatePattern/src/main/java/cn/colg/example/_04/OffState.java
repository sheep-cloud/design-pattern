package cn.colg.example._04;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体状态类 - 关闭状态
 *
 * @author colg
 */
@Slf4j
public class OffState implements State {

    @Override
    public void on(Switch s) {
        log.info("{} 打开！", s.getName());
        Switch.setState(Switch.getState("on"));
    }

    @Override
    public void off(Switch s) {
        log.info("{} 已经关闭！", s.getName());
    }
}
