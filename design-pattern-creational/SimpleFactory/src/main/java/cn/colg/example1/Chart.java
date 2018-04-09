package cn.colg.example1;

/**
 * 简单工厂模式 （一）
 *
 * @author colg
 */
public class Chart {

	/** 图表类型 */
	private String type;

	/**
	 * 构造函数，初始化对象
	 * 
	 * @param type
	 */
	public Chart(Object[][] data, String type) {
		this.type = type;
		if (type.equalsIgnoreCase("histogram")) {
			// 初始化柱状图
		} else if (type.equalsIgnoreCase("pie")) {
			// 初始化饼状图
		} else if (type.equalsIgnoreCase("line")) {
			// 初始化折线图
		}
	}

	public void display() {
		if (type.equalsIgnoreCase("histogram")) {
			// 显示柱状图
		} else if (type.equalsIgnoreCase("pie")) {
			// 显示饼状图
		} else if (type.equalsIgnoreCase("line")) {
			// 显示折线图
		}
	}
}
