package cn.colg.example._04.text;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品
 *
 * @author colg
 */
@Slf4j
public class SummerText implements Text {

    public SummerText() {
        log.info("创建SummerText");
    }

    @Override
    public void display() {
        log.info("显示蓝色边框文本框");
    }
}
