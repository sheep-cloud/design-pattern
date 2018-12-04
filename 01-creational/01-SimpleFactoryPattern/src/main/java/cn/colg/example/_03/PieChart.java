package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体产品角色 - 饼状图
 *
 * @author colg
 */
@Slf4j
public class PieChart implements Chart {

    public PieChart() {
        log.info("创建饼状图");
    }

    @Override
    public void display() {
        log.info("显示饼状图");
    }

}
