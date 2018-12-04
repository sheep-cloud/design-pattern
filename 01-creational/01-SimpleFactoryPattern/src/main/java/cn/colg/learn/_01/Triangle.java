package cn.colg.learn._01;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品角色 - 三角形
 *
 * @author colg
 */
@Slf4j
public class Triangle extends AbstractGeometryFactory {

    public Triangle() {
        log.info("创建三角形");
    }

    @Override
    public void draw() {
        log.info("绘制三角形");
    }

    @Override
    public void erase() {
        log.info("擦除三角形");
    }

}
