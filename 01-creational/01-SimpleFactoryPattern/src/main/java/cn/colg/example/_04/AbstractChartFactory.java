package cn.colg.example._04;

import cn.colg.example._03.Chart;
import cn.colg.example._03.HistogramChart;
import cn.colg.example._03.LineChart;
import cn.colg.example._03.PieChart;
import lombok.extern.slf4j.Slf4j;

/**
 * 简化简单工厂模式：抽象产品角色（图表） + 工厂类
 *
 * @author colg
 */
@Slf4j
public abstract class AbstractChartFactory {

    /**
     * 静态工厂方法
     *
     * @param type
     * @return
     * @author colg
     */
    public static Chart getChart(String type) {
        Chart chart = null;
        if (type.equals("histogram")) {
            chart = new HistogramChart();
            log.info("初始化设置柱状图！");
        } else if (type.equals("pie")) {
            chart = new PieChart();
            log.info("初始化设置饼状图！");
        } else if (type.equals("line")) {
            chart = new LineChart();
            log.info("初始化设置折线图！");
        }
        return chart;
    }

    /**
     * 显示图表
     *
     * @author colg
     */
    public abstract void display();
}
