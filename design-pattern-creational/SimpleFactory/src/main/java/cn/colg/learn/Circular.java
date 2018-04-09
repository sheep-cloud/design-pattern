package cn.colg.learn;

/**
 * 具体产品角色：圆形
 *
 * @author colg
 */
public class Circular extends Geometry {
	
	

	public Circular() {
		System.out.println("创建圆形！");
	}

	@Override
	public void dram() {
		System.out.println("Circular.dram()");
	}

	@Override
	public void erase() {
		System.out.println("Circular.erase()");
	}

}
