package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品角色 - 圆形
 *
 * @author colg
 */
@Slf4j
public class Circular extends AbstractGeometryFactory {

    public Circular() {
        log.info("创建圆形");
    }

    @Override
    public void draw() {
        log.info("绘制圆形");
    }

    @Override
    public void erase() {
        log.info("擦除圆形");
    }

}
