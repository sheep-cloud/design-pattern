package cn.colg.example._04.button;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品
 *
 * @author colg
 */
@Slf4j
public class SummerButton implements Button {

    public SummerButton() {
        log.info("创建SummerButton");
    }

    @Override
    public void display() {
        log.info("显示浅蓝色按钮");
    }
}
