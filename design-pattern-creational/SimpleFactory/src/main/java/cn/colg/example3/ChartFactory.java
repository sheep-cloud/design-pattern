package cn.colg.example3;

/**
 * 工厂类：图表工厂类
 *
 * @author colg
 */
public class ChartFactory {

	/**
	 * 静态工厂方法，创建图表
	 * 
	 * @param type
	 * @return
	 */
	public static Chart getChart(String type) {
		Chart chart = null;
		if ("histogram".equalsIgnoreCase(type)) {
			chart = new HistogramChart();
			System.out.println("初始化设置柱状图！");
		} else if ("pie".equalsIgnoreCase(type)) {
			chart = new PieChart();
			System.out.println("初始化设置饼状图！");
		} else if ("line".equalsIgnoreCase(type)) {
			chart = new LineChart();
			System.out.println("初始化设置折线图！");
		}
		return chart;
	}
}
