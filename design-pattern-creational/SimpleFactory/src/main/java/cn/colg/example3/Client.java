package cn.colg.example3;

/**
 * 
 *
 * @author colg
 */
public class Client {

	public static void main(String[] args) {
		Chart chart;
		chart = ChartFactory.getChart("histogram");// 通过静态工厂方法创建产品
		chart.display();

		// 使用工厂类的静态工厂方法创建产品对象，如果需要更换产品，只需修改静态工厂方法中的参数即可
		chart = ChartFactory.getChart("pie");// 通过静态工厂方法创建产品
		chart.display();

		chart = ChartFactory.getChart("line");// 通过静态工厂方法创建产品
		chart.display();
	}
}
