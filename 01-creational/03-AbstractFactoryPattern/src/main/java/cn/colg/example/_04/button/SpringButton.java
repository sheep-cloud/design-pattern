package cn.colg.example._04.button;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品
 *
 * @author colg
 */
@Slf4j
public class SpringButton implements Button {

    public SpringButton() {
        log.info("创建SpringButton");
    }

    @Override
    public void display() {
        log.info("显示浅绿色按钮");
    }
}
