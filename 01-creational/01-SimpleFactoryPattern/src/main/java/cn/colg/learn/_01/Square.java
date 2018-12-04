package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品角色 - 方形
 *
 * @author colg
 */
@Slf4j
public class Square extends AbstractGeometryFactory {

    public Square() {
        log.info("创建方形");
    }

    @Override
    public void draw() {
        log.info("绘制方形");
    }

    @Override
    public void erase() {
        log.info("擦除方形");
    }
}
