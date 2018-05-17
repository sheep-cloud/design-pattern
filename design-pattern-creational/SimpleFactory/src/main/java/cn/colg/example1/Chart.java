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
		if ("histogram".equalsIgnoreCase(type)) {
			// 初始化柱状图
		} else if ("pie".equalsIgnoreCase(type)) {
			// 初始化饼状图
		} else if ("line".equalsIgnoreCase(type)) {
			// 初始化折线图
		}
	}

	public void display() {
		if ("histogram".equalsIgnoreCase(type)) {
			// 显示柱状图
		} else if ("pie".equalsIgnoreCase(type)) {
			// 显示饼状图
		} else if ("line".equalsIgnoreCase(type)) {
			// 显示折线图
		}
	}
}
