package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体构件类 - 文本框类
 *
 * @author colg
 */
@Slf4j
public class TextBox extends AbstractComponent {

    @Override
    public void display() {
        log.info("显示文本框！");
    }
}
