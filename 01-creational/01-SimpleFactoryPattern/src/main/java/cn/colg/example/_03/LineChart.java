package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品角色 - 折线图
 *
 * @author colg
 */
@Slf4j
public class LineChart implements Chart {

    public LineChart() {
        log.info("创建折线图");
    }

    @Override
    public void display() {
        log.info("显示折线图");
    }

}
