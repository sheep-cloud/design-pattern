package cn.colg.example._04;

import cn.colg.example._03.Chart;
import cn.hutool.setting.dialect.Props;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {

    public static void main(String[] args) {
        Chart chart;

        // 读取配置文件中的参数
        String type = Props.getProp("config.properties").getProperty("chartType");

        chart = AbstractChartFactory.getChart(type);
        chart.display();
    }
}
