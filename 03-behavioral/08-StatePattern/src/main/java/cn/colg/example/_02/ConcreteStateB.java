package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体状态类
 * 
 * @author colg
 */
@Slf4j
public class ConcreteStateB implements State {

    @Override
    public void handle() {
        // 方法具体实现代码
        log.info("具体状态类 ConcreteStateB 的方法具体实现代码");
    }
}
