package cn.colg.example._04;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体状态类 - 打开状态
 *
 * @author colg
 */
@Slf4j
public class OnState implements State {

    @Override
    public void on(Switch s) {
        log.info("{} 已经打开！", s.getName());
    }

    @Override
    public void off(Switch s) {
        log.info("{} 关闭！", s.getName());
        Switch.setState(Switch.getState("off"));
    }
}
