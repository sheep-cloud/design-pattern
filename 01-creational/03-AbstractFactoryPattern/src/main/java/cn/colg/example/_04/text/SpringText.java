package cn.colg.example._04.text;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品
 *
 * @author colg
 */
@Slf4j
public class SpringText implements Text {

    public SpringText() {
        log.info("创建SpringText");
    }

    @Override
    public void display() {
        log.info("显示绿色边框文本框");
    }
}
