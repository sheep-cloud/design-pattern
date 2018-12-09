package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体状态类
 * 
 * <pre>
 * 它是抽象状态类的子类，每一个子类实现一个与环境类的一个状态相关的行为，每一个具体状态类对应环境的一个具体状态，不同的具体状态类其行为有所不同。
 * </pre>
 *
 * @author colg
 */
@Slf4j
public class ConcreteState implements State {

    @Override
    public void handle() {
        // 方法具体实现代码
        log.info("具体状态类 ConcreteState 的方法具体实现代码");
    }
}
