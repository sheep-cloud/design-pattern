package cn.colg.learn;

/**
 * 具体产品角色：方形
 *
 * @author colg
 */
public class Square extends AbstractGeometry {

	public Square() {
		System.out.println("创建方形！");
	}

	@Override
	public void dram() {
		System.out.println("Square.dram()");
	}

	@Override
	public void erase() {
		System.out.println("Square.erase()");
	}

}
