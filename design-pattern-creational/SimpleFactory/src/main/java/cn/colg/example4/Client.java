package cn.colg.example4;

import cn.colg.example3.Chart;
import cn.colg.example3.ChartFactory;
import cn.hutool.setting.dialect.Props;

/**
 * 从properties里读取图表类型，通过工厂类的静态方法创建对象
 *
 * @author colg
 */
public class Client {

	public static void main(String[] args) {
		Props props = new Props("config.properties");
		String type = props.getStr("chartType"); // 读取配置文件中的参数

		Chart chart = ChartFactory.getChart(type);// 创建产品参数对象
		chart.display();
	}
}
