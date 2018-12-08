package cn.colg.example._04;

import cn.colg.example._03.Chart;
import cn.colg.util.IniUtil;

/**
 * 客户端
 *
 * @author colg
 */
public class Client {
    public static void main(String[] args) {
        String type = IniUtil.getStr("example._04");
        Chart chart = AbstractChartFactory.getChart(type);
        chart.display();
    }
}
