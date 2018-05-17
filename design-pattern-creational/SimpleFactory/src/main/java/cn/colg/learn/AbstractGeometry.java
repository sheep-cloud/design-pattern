package cn.colg.learn;

/**
 * 抽象产品角色：几何图形 <br />
 * 
 * 简化的简单工厂模式：合并抽象产品类和工厂类
 *
 * @author colg
 */
public abstract class AbstractGeometry {

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
	public static AbstractGeometry getGeometry(String type) {
		AbstractGeometry geometry = null;
		if ("circular".equalsIgnoreCase(type)) {
			geometry = new Circular();
		} else if ("square".equalsIgnoreCase(type)) {
			geometry = new Square();
		} else if ("triangle".equalsIgnoreCase(type)) {
			geometry = new Triangle();
		}
		return geometry;
	}
}
