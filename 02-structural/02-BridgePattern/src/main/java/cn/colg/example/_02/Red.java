package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体实现类 - 红色
 *
 * @author colg
 */
@Slf4j
public class Red implements Color {

    @Override
    public void coloring() {
        log.info("着色 - 红色");
    }
}
