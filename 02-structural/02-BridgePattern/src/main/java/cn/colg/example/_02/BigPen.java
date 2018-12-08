package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 大号笔
 *
 * @author colg
 */
@Slf4j
public class BigPen extends AbstractPen {

    public BigPen(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        log.info("大号笔");
        // xxx
        color.coloring();
        // xxx
    }
}
