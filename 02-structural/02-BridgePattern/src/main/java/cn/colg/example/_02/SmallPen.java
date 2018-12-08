package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 小号笔
 *
 * @author colg
 */
@Slf4j
public class SmallPen extends AbstractPen {

    public SmallPen(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        log.info("小号笔");
        // xxx
        color.coloring();
        // xxx
    }
}
