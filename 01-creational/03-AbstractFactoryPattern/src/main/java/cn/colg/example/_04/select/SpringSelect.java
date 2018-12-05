package cn.colg.example._04.select;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品
 *
 * @author colg
 */
@Slf4j
public class SpringSelect implements Select {

    public SpringSelect() {
        log.info("创建SpringSelect");
    }

    @Override
    public void display() {
        log.info("显示浅绿色边框下拉框");
    }
}
