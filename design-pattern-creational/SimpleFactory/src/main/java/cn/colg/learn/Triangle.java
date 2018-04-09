package cn.colg.learn;

/**
 * 具体产品角色：三角形
 *
 * @author colg
 */
public class Triangle extends Geometry {

	public Triangle() {
		System.out.println("创建三角形！");
	}

	@Override
	public void dram() {
		System.out.println("Triangle.dram()");
	}

	@Override
	public void erase() {
		System.out.println("Triangle.erase()");
	}

}
