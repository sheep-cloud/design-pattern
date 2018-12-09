package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体策略类 - 直升机
 *
 * @author colg
 */
@Slf4j
public class Helicopter implements Feature {

    @Override
    public void takeOff() {
        log.info("垂直起飞");
    }

    @Override
    public void fly() {
        log.info("音速飞行");
    }
}
