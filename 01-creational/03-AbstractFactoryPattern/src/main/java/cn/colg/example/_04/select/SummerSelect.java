package cn.colg.example._04.select;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品
 *
 * @author colg
 */
@Slf4j
public class SummerSelect implements Select {

    public SummerSelect() {
        log.info("创建SummerSelect");
    }

    @Override
    public void display() {
        log.info("显示蓝色边框下拉框");
    }
}
