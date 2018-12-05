package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 中号笔
 *
 * @author colg
 */
@Slf4j
public class MiddlePen extends AbstractPen {

    @Override
    public void draw() {
        log.info("中号笔");
        // xxx
        color.coloring();
        // xxx
    }

}
