package cn.colg.example._03;

import lombok.extern.slf4j.Slf4j;

/**
 * 工厂角色 - 图表工厂
 *
 * @author colg
 */
@Slf4j
public class ChartFactory {

    /**
     * 静态工厂方法
     *
     * @param type
     * @return
     * @author colg
     */
    public static Chart getChart(String type) {
        Chart chart = null;
        if ("histogram".equals(type)) {
            chart = new HistogramChart();
            log.info("初始化设置柱状图！");
        } else if ("pie".equals(type)) {
            chart = new PieChart();
            log.info("初始化设置饼状图！");
        } else if ("line".equals(type)) {
            chart = new LineChart();
            log.info("初始化设置折线图！");
        }
        return chart;
    }
}
