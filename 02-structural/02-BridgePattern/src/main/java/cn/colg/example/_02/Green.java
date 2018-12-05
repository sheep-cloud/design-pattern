package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体实现类 - 绿色
 *
 * @author colg
 */
@Slf4j
public class Green implements Color {

    @Override
    public void coloring() {
        log.info("着色 - 绿色");
    }
}
