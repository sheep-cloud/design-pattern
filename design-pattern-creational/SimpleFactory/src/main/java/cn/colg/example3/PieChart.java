package cn.colg.example3;

/**
 * 具体产品类：饼类图
 *
 * @author colg
 */
public class PieChart implements Chart {

	public PieChart() {
		System.out.println("创建饼类图！");
	}

	@Override
	public void display() {
		System.out.println("显示饼类图！");
	}

}
