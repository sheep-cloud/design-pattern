package cn.colg.learn;

/**
 * 抽象产品角色：几何图形 <br />
 * 
 * 简化的简单工厂模式：合并抽象产品类和工厂类
 *
 * @author colg
 */
public abstract class Geometry {

	/**
	 * 绘制方法
	 */
	public abstract void dram();

	/**
	 * 擦除方法
	 */
	public abstract void erase();

	/**
	 * 根据传入的类型创建不同的几何图形
	 * 
	 * @param type
	 * @return
	 */
	public static Geometry getGeometry(String type) {
		Geometry geometry = null;
		if (type.equalsIgnoreCase("circular")) {
			geometry = new Circular();
		} else if (type.equalsIgnoreCase("square")) {
			geometry = new Square();
		} else if (type.equalsIgnoreCase("triangle")) {
			geometry = new Triangle();
		}
		return geometry;
	}
}
