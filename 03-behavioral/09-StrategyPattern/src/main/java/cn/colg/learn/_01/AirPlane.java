package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体策略类 - 客机
 *
 * @author colg
 */
@Slf4j
public class AirPlane implements Feature {

    @Override
    public void takeOff() {
        log.info("长距离起飞");
    }

    @Override
    public void fly() {
        log.info("亚音速飞行");
    }
}
